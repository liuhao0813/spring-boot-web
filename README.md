# spring-boot-web
springboot2.0+mybatis3+thymeleaft3.0+mysql  

1、创建数据库表
CREATE TABLE `sso`.`tpl_user_t` (
  `lname` VARCHAR(100) NULL COMMENT '真实姓名',
  `user_id` DOUBLE NOT NULL COMMENT '用户ID',
  `email` VARCHAR(120) NULL COMMENT '电子邮件\n',
  `emp_number` VARCHAR(45) NULL COMMENT '员工编号\n',
  `user_account` VARCHAR(45) NULL COMMENT '用户账号\n',
  `user_password` VARCHAR(100) NULL COMMENT '用户密码\n',
  `login_token` VARCHAR(100) NULL COMMENT '登录TOKEN\n',
  `created_by` DOUBLE NULL COMMENT '创建人\n',
  `creation_date` DATE NULL COMMENT '创建时间\n',
  `last_updated_by` DOUBLE NULL COMMENT '最后修改人\n',
  `last_update_date` DATE NULL COMMENT '最后修改时间\n',
  PRIMARY KEY (`user_id`))
COMMENT = '用户表';



