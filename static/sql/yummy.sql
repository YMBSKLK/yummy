CREATE TABLE IF NOT EXISTS public.yummy_dict (
	id int8 NOT NULL,
	parent_id int8 NULL,
	dict_code varchar(50) NULL,
	dict_key varchar(50) NULL,
	dict_value varchar(50) NULL,
	sort int4 NULL,
	remark varchar(255) NULL,
	create_user int8 NULL,
	create_time timestamp(6) NULL,
	update_user int8 NULL,
	update_time timestamp(6) NULL,
	status int4 NOT NULL,
	is_deleted int4 NOT NULL,
	CONSTRAINT yummy_dict_pk PRIMARY KEY (id)
);
COMMENT ON TABLE public.yummy_dict IS '系统字典表';

-- Column comments

COMMENT ON COLUMN public.yummy_dict.id IS '主键id';
COMMENT ON COLUMN public.yummy_dict.parent_id IS '父级id(顶层默认0)';
COMMENT ON COLUMN public.yummy_dict.dict_code IS '字典编码';
COMMENT ON COLUMN public.yummy_dict.dict_key IS '键';
COMMENT ON COLUMN public.yummy_dict.dict_value IS '值';
COMMENT ON COLUMN public.yummy_dict.sort IS '顺序';
COMMENT ON COLUMN public.yummy_dict.remark IS '备注';
COMMENT ON COLUMN public.yummy_dict.create_user IS '创建用户';
COMMENT ON COLUMN public.yummy_dict.create_time IS '创建时间';
COMMENT ON COLUMN public.yummy_dict.update_user IS '更新用户';
COMMENT ON COLUMN public.yummy_dict.update_time IS '更新时间';
COMMENT ON COLUMN public.yummy_dict.status IS '状态';
COMMENT ON COLUMN public.yummy_dict.is_deleted IS '是否已删除';
