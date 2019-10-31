CREATE TABLE IF NOT EXISTS `dm_role`(
   `role_id` INT UNSIGNED AUTO_INCREMENT,
   `role_name_cn` VARCHAR(20) NOT NULL,
   `role_pwd` VARCHAR(40) NOT NULL,
   `role_num` VARCHAR(10) NOT NULL,
   `role_name` VARCHAR(10) NOT NULL,
   `create_date` timestamp  NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
   PRIMARY KEY (role_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
