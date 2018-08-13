/*组织*/
INSERT INTO sys_org_t (sz_id, sz_caption, sz_contacts, sz_tel, sz_mobile, sz_addr, ts_created, ts_updated) VALUES
  ('1','alva','zhang','0371-6636123','13100001111','北京',now(),now()),
  ('2','google','wang','0371-6636124','13100002222','上海',now(),now()),
  ('3','baidu','li','0371-6636125','13100003333','天津',now(),now()),
  ('4','alibaba','zhao','0371-6636126','13100004444','石家庄',now(),now())
;

/*授权*/
INSERT INTO app_key_t (sz_id, sz_key, sz_org_id, ts_created, ts_updated) VALUES
  ('1','123','1',now(),now()),
  ('2','111','2',now(),now()),
  ('3','432','3',now(),now()),
  ('4','ag_sd','4',now(),now())
;

/*学科*/
INSERT INTO sys_subject_t(sz_id, sz_caption) VALUES (
'1','语文'),
('2','数学'),
('3','英语'),
('4','政治'),
('5','历史'),
('6','地理'),
('7','物理'),
('8','化学'),
('9','生物')
;
/*delete from sys_subject_t*/
/*出版社*/
INSERT INTO sys_publishing_t(sz_id, sz_caption) VALUES ('1','人民教育出版社'),('2','电子工业出版社');

/*教材*/
INSERT INTO sys_textbook_t(sz_id, sz_caption, sz_edition, sz_section, sz_grade, sz_subject_id, sz_pub_id, sz_store, sz_md5, sz_tag, ts_created, ts_updated) VALUES
  ('1','初中语文1.zip','第一版','初中','七年级','1','1','E:/wzh/book','文件的MD5校验和','存储其他的信息（暂未定义）',now(),now()),
  ('2','初中数学1.zip','第一版','初中','七年级','2','2','E:/wzh/book','文件的MD5校验和','存储其他的信息（暂未定义）',now(),now()),
  ('3','初中英语1.zip','第一版','初中','七年级','3','2','E:/wzh/book','文件的MD5校验和','存储其他的信息（暂未定义）',now(),now()),
  ('4','初中政治1.zip','第一版','初中','七年级','4','1','E:/wzh/book','文件的MD5校验和','存储其他的信息（暂未定义）',now(),now())
;
INSERT INTO sys_textbook_t(sz_id, sz_caption, sz_edition, sz_section, sz_grade, sz_subject_id, sz_pub_id, sz_store, sz_md5, sz_tag, ts_created, ts_updated) VALUES
  ('11','初中语文11.zip','第一版','初中','七年级','1','1','E:/wzh/book','文件的MD5校验和','存储其他的信息（暂未定义）',now(),now()),
  ('12','初中语文12.zip','第一版','初中','七年级','1','1','E:/wzh/book','文件的MD5校验和','存储其他的信息（暂未定义）',now(),now()),
  ('13','初中语文13.zip','第一版','初中','七年级','1','1','E:/wzh/book','文件的MD5校验和','存储其他的信息（暂未定义）',now(),now()),
  ('14','初中语文14.zip','第一版','初中','七年级','1','1','E:/wzh/book','文件的MD5校验和','存储其他的信息（暂未定义）',now(),now())
;
INSERT INTO sys_textbook_t(sz_id, sz_caption, sz_edition, sz_section, sz_grade, sz_subject_id, sz_pub_id, sz_store, sz_md5, sz_tag, ts_created, ts_updated) VALUES
  ('21','高中语文11.zip','第一版','高中','十年级','1','1','E:/wzh/book','文件的MD5校验和','存储其他的信息（暂未定义）',now(),now());

/*导出*/
INSERT INTO sys_export_t(sz_id,sz_directory,sz_comment,sz_operator,ts_created,ts_updated) VALUES
  ('1','E:/wzh/aa','第一次导入','阿凡达',now(),now()),
  ('2','E:/wzh/bb','第一次导入','黄飞鸿',now(),now())
;




