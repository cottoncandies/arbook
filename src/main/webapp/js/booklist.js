layui.use(['element', 'table', 'form', 'jquery', 'laydate'], function () {
    var element = layui.element;
    var table = layui.table;
    var form = layui.form;
    var $ = layui.jquery;
    var laydate = layui.laydate;

    //记录选中的数据:做缓存使用,作为参数传递给后台,然后生成pdf ,压缩
    var ids = new Array();
    //当前表格中的全部数据:在表格的checkbox全选的时候没有得到数据, 因此用全局存放变量
    var table_data = new Array();

    /*加载学科下拉框选项*/
    $.ajax({
        type: 'get',
        url: 'selectSubject',
        dataType: 'json',
        success: function (data) {
            $("#subject").html("");
            $.each(data, function (idx, val) {
                var option1 = $("<option>").val(val.id).text(val.subject);
                $("#subject").append($("<option>"));
                $("#subject").append(option1);
                form.render('select');
            });
        }
    });

    /*加载出版社下拉框选项*/
    $.ajax({
        type: 'get',
        url: 'selectPublish',
        dataType: 'json',
        success: function (data) {
            $("#publish").html("");
            $.each(data, function (idx, val) {
                var option1 = $("<option>").val(val.id).text(val.publish);
                $("#publish").append($("<option>"));
                $("#publish").append(option1);
                form.render('select');
            });
        }
    });

    /*加载学段和年级下拉框选项*/
    $.ajax({
        type: 'get',
        url: 'ApiV1/selectDistinctSectionAndGrade',
        dataType: 'json',
        success: function (data) {
            $("#section").html("");
            $("#grade").html("");
            var sections = data.sections;
            var grades = data.grades;
            $.each(sections, function (idx, val) {
                var option1 = $("<option>").val(val).text(val);
                $("#section").append($("<option>"));
                $("#section").append(option1);
                form.render('select');
            });
            $.each(grades, function (idx, val) {
                var option2 = $("<option>").val(val).text(val);
                $("#grade").append($("<option>"));
                $("#grade").append(option2);
                form.render('select');
            });
        }
    });

    /*点击查询按钮触发事件*/
    form.on('submit(search)', function () {
        var subjectId = $('#subject').val();
        var publishId = $('#publish').val();
        var section = $('#section').val();
        var grade = $('#grade').val();

        table.render({
            elem: '#bookTableId',
            url: 'ApiV1/GetIndex',
            where: {
                'ak': 111,
                'subjectId': subjectId,
                'publishId': publishId,
                'section': section,
                'grade': grade
            },
            method: 'post',
            limit: 20,
            page: true,
            even: true,
            cols: [[
                {type: 'checkbox'},
                {field: 'id', title: 'ID', width: 80, sort: true},
                {field: 'caption', title: '教材名称', edit: 'text'},
                {   field: 'cover',
                    title: '封面文件',
                    //templet:'<div><img id="img" src="images/{{ d.cover}}"></div>',style:'height:48px;width:48px;line-height:48px!important;'
                },
                {field: 'edition', title: '教材版本'},
                {field: 'section', title: '学段'},
                {field: 'grade', title: '年级'},
                {field: 'publish', title: '出版社'},
                {field: 'subject', title: '学科'},
                {field: 'md5', title: '文件的MD5值'},
                {field: 'size', title: '文件大小'},
                {fixed: 'right', title: '操作', toolbar: "#operationTpl", align: 'center'}
            ]],
            done: function (res, curr, count) {
                $("#bookCountNum").text(count);
                //数据表格加载完成时调用此函数
                //如果是异步请求数据方式，res即为你接口返回的信息。
                //如果是直接赋值的方式，res即为：{data: [], count: 99} data为当前页数据、count为数据总长度

                //设置全部数据到全局变量
                table_data = res.data;

                //在缓存中找到id ,然后设置data表格中的选中状态
                //循环所有数据，找出对应关系，设置checkbox选中状态
                for (var i = 0; i < res.data.length; i++) {
                    for (var j = 0; j < ids.length; j++) {
                        //数据id和要勾选的id相同时checkbox选中
                        if (res.data[i].id == ids[j]) {
                            //这里才是真正的有效勾选
                            res.data[i]["LAY_CHECKED"] = 'true';
                            //找到对应数据改变勾选样式，呈现出选中效果
                            var index = res.data[i]['LAY_TABLE_INDEX'];
                            $('.layui-table-fixed-l tr[data-index=' + index + '] input[type="checkbox"]').prop('checked', true);
                            $('.layui-table-fixed-l tr[data-index=' + index + '] input[type="checkbox"]').next().addClass('layui-form-checked');
                        }
                    }
                }
                //设置全选checkbox的选中状态，只有改变LAY_CHECKED的值， table.checkStatus才能抓取到选中的状态
                var checkStatus = table.checkStatus('my-table');
                if (checkStatus.isAll) {
                    $(' .layui-table-header th[data-field="0"] input[type="checkbox"]').prop('checked', true);
                    $('.layui-table-header th[data-field="0"] input[type="checkbox"]').next().addClass('layui-form-checked');
                }
            }
        })
        return false;
    })

    //复选框选中监听,将选中的id 设置到缓存数组,或者删除缓存数组
    table.on('checkbox(bookTableFilter)', function (obj) {
        if (obj.checked == true) {
            if (obj.type == 'one') {
                ids.push(obj.data.id);
            } else {
                for (var i = 0; i < table_data.length; i++) {
                    ids.push(table_data[i].id);
                }
            }
        } else {
            if (obj.type == 'one') {
                for (var i = 0; i < ids.length; i++) {
                    if (ids[i] == obj.data.id) {
                        ids.remove(i);
                    }
                }
            } else {
                for (var i = 0; i < ids.length; i++) {
                    for (var j = 0; j < table_data.length; j++) {
                        if (ids[i] == table_data[j].id) {
                            ids.remove(i);
                        }
                    }
                }
            }
        }
    });

    //删除数组自定义函数
    Array.prototype.remove = function (dx) {
        if (isNaN(dx) || dx > this.length) {
            return false;
        }
        for (var i = 0, n = 0; i < this.length; i++) {
            if (this[i] != this[dx]) {
                this[n++] = this[i]
            }
        }
        this.length -= 1
    }

    table.on('tool(bookTableFilter)', function (obj) {
        var row_data = obj.data;
        var layEvent = obj.event;
        if (layEvent === 'edit') {
            layer.open({
                title: '编辑教材',
                type: 2,
                shade: true,
                maxmin: false,
                shade: 0.5,
                area: ['90%', '90%'],
                content: 'book-edit.html',
                zIndex: layer.zIndex,
                success : function(layero, index){
                    var body = layui.layer.getChildFrame('body', index);
                    // 取到弹出层里的元素，并把编辑的内容放进去
                    body.find(".id").val(row_data.id);  //将选中的数据的id传到编辑页面的隐藏域，便于根据ID修改数据
                    body.find(".caption").val(row_data.caption);
                    body.find(".cover").val(row_data.cover);
                    body.find(".edition").val(row_data.edition);
                    body.find(".section").val(row_data.section);
                    body.find(".grade").val(row_data.grade);
                    body.find(".publish").val(row_data.publish);
                    body.find(".subject").val(row_data.subject);
                    body.find(".md5").val(row_data.md5);
                    body.find(".size").val(row_data.size);
                    // 记得重新渲染表单
                    form.render();
                },
                end: function () {
                    // $(".layui-laypage-btn")[0].click();
                    table.reload('bookTableId');
                }
            });
        } else if (layEvent === 'del') {
            layer.confirm("确定要删除吗？", {skin: 'layui-layer-lan', icon: 2, title: '提示', anim: 6}, function (index) {
                $.post('ApiV1/deleteBook', {bookId: data.id}, function () {
                    obj.del();
                    layer.close(index);
                })
            });
        }
    });

    /*点击批量导出按钮触发事件*/
    $("#batchEnabled").click(function () {
        if (ids.length == 0) {
            layer.msg("请选择导出的文件!");
        } else {
            layer.prompt({title: '导出文件名'}, function (val, index) {
                var directory = val;
                layer.close(index);
                layer.confirm("确定要批量导出吗？", {skin: 'layui-layer-lan', icon: 3, title: '提示', anim: 1}, function () {
                    var index = layer.load();
                    $.post("ApiV1/exportBookList", {bookIds: ids, directory: directory}, function (data) {
                        layer.close(index);
                        layer.msg(data.msg, {time: 5000});
                    })
                });
            });
        }
    });
})