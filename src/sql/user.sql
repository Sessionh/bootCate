CREATE DATABASE mytest;

CREATE TABLE `users` (
    `id` int(11) NOT NULL AUTO_INCREMENT,        #用户唯一ID
    `alias` varchar(100) DEFAULT NULL, #姓名别名
    `name` varchar(100) DEFAULT NULL,  #用户名称 (唯一性)
    `passwd` varchar(100) DEFAULT NULL,
    `email` varchar(100) DEFAULT NULL,  #邮件
    `phoneNumber` varchar(100) DEFAULT NULL, #手机号码
    `weChat` varchar(100) DEFAULT NULL, #微信号
    `cancel` varchar(100) DEFAULT NULL,
    `deptId` int(100), #关联部门的id
    `role` int(100),
    PRIMARY KEY (`id`),
    UNIQUE KEY `idx_user_name` (`name`) USING BTREE
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8;


