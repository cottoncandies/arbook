DROP TABLE IF EXISTS "app_key_t" CASCADE
;

DROP TABLE IF EXISTS "sys_org_t" CASCADE
;

DROP TABLE IF EXISTS "sys_publishing_t" CASCADE
;

DROP TABLE IF EXISTS "sys_subject_t" CASCADE
;

DROP TABLE IF EXISTS "sys_textbook_t" CASCADE
;

DROP TABLE IF EXISTS "sys_export_t" CASCADE
;

DROP TABLE IF EXISTS "sys_user_t" CASCADE
;

DROP TABLE IF EXISTS "sys_log_t" CASCADE
;

CREATE TABLE "app_key_t"
(
	"sz_id" varchar(36)	 NOT NULL,
	"sz_key" varchar(63)	 NOT NULL,
	"sz_ip_addrs" varchar(255)	 NOT NULL DEFAULT '0.0.0.0',
	"sz_org_id" varchar(36)	 NOT NULL,
	"nt_api_ver" integer NOT NULL DEFAULT 1,
	"ng_call_times" bigint NOT NULL DEFAULT 0,
	"ts_created" timestamp NOT NULL,
	"ts_updated" timestamp NOT NULL,
	"nt_row_state" integer NOT NULL DEFAULT 1,
	"nt_row_version" integer NOT NULL DEFAULT 1
)
;

CREATE TABLE "sys_org_t"
(
	"sz_id" varchar(36)	 NOT NULL,
	"sz_caption" varchar(127)	 NOT NULL,
	"sz_contacts" varchar(127)	 NOT NULL,
	"sz_tel" varchar(31)	,
	"sz_mobile" varchar(31)	,
	"sz_addr" varchar(255)	,
	"ts_created" timestamp NOT NULL,
	"ts_updated" timestamp NOT NULL,
	"nt_row_state" integer NOT NULL DEFAULT 1,
	"nt_row_version" integer NOT NULL DEFAULT 1
)
;

CREATE TABLE "sys_publishing_t"
(
	"sz_id" varchar(36)	 NOT NULL,
	"sz_caption" varchar(63)	 NOT NULL
)
;

CREATE TABLE "sys_subject_t"
(
	"sz_id" varchar(36)	 NOT NULL,
	"sz_caption" varchar(63)	 NOT NULL
)
;

CREATE TABLE "sys_textbook_t"
(
	"sz_id" varchar(36)	 NOT NULL,
	"sz_caption" varchar(127)	 NOT NULL,
	"sz_cover" varchar(255)	 NOT NULL DEFAULT '00000.jpg',
	"sz_edition" varchar(63)	,
	"sz_section" varchar(31)	 NOT NULL,
	"sz_grade" varchar(31)	 NOT NULL,
	"nt_term" integer NOT NULL DEFAULT 0,
	"sz_subject_id" varchar(36)	 NOT NULL,
	"sz_pub_id" varchar(36)	 NOT NULL,
	"sz_insti" varchar(15)	 NOT NULL DEFAULT '633',
	"sz_store" varchar(255)	 NOT NULL,
	"sz_md5" varchar(63)	 NOT NULL,
	"ng_size" bigint NOT NULL DEFAULT 0,
	"sz_tag" varchar(255)	,
	"ts_created" timestamp NOT NULL,
	"ts_updated" timestamp NOT NULL,
	"nt_row_state" integer NOT NULL DEFAULT 1,
	"nt_row_version" integer NOT NULL DEFAULT 1
)
;

CREATE TABLE "sys_export_t"
(
	"sz_id" INTEGER	 NOT NULL,
	"sz_directory" varchar(127)	 NOT NULL UNIQUE ,
	"sz_comment" varchar(255)	,
	"sz_operator" varchar(255)	,
	"ts_created" timestamp NOT NULL,
	"ts_updated" timestamp NOT NULL,
	"nt_row_state" integer NOT NULL DEFAULT 1,
	"nt_row_version" integer NOT NULL DEFAULT 1
)
;

CREATE TABLE "sys_user_t"
(
	"sz_id" INTEGER NOT NULL,
	"sz_email" varchar(127)	 NOT NULL UNIQUE ,
	"sz_password" varchar(255)	,
	"sz_phone" varchar(255) NOT NULL UNIQUE	,
	"ts_created" timestamp NOT NULL,
	"ts_updated" timestamp NOT NULL,
	"nt_row_state" integer NOT NULL DEFAULT 1,
	"nt_row_version" integer NOT NULL DEFAULT 1
)
;

CREATE TABLE "sys_log_t"
(
	"sz_id" INTEGER	NOT NULL,
	"sz_type" varchar(31) ,
	"sz_title" varchar(31)	,
	"sz_remote_addr" varchar(63)	,
	"sz_request_uri" varchar(31)	,
	"sz_method" varchar(31),
	"sz_params" varchar(63),
	"ts_created" timestamp NOT NULL,
	"sz_email" varchar(127) NOT NULL,
	"sz_detail" varchar(3000)
)
;


ALTER TABLE "app_key_t" ADD CONSTRAINT "app_key__pk"
	PRIMARY KEY ("sz_id")
;

ALTER TABLE "sys_org_t" ADD CONSTRAINT "sys_org__pk"
	PRIMARY KEY ("sz_id")
;

ALTER TABLE "sys_publishing_t" ADD CONSTRAINT "sys_publishing__pk"
	PRIMARY KEY ("sz_id")
;

ALTER TABLE "sys_subject_t" ADD CONSTRAINT "sys_subject__pk"
	PRIMARY KEY ("sz_id")
;

ALTER TABLE "sys_textbook_t" ADD CONSTRAINT "sys_textbook__pk"
	PRIMARY KEY ("sz_id")
;

ALTER TABLE "sys_export_t" ADD CONSTRAINT "sys_export__pk"
	PRIMARY KEY ("sz_id")
;

ALTER TABLE "sys_user_t" ADD CONSTRAINT "sys_user__pk"
	PRIMARY KEY ("sz_id")
;

ALTER TABLE "sys_log_t" ADD CONSTRAINT "sys_log__pk"
	PRIMARY KEY ("sz_id")
;

-- 业务需求 user log export 表的id字段设为自增(原因:1.不与其他表关联,id没有业务处理,只是唯一标识一条数据 2.存储效率高于32位或36位的UUID)

-- 1.创建user log export 表
-- 2.创建序列
-- 3.Mybatis中sql语句将序列的值赋给id 实现id字段自增
CREATE SEQUENCE sys_user_t_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

CREATE SEQUENCE sys_log_t_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

-- drop sequence sys_log_t_id_seq;

CREATE SEQUENCE sys_export_t_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;