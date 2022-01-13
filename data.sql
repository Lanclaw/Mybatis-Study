create database mybatis;
use mybatis;
create table `user`(
                       `id` INT(20) not null primary key,
                       `name` varchar(30) default null,
                       `pwd` varchar(30) default null
)engine=INNODB default charset=utf8;

insert into `user` (`id`, `name`, `pwd`) values
                                             (1, '狂神', '123456'),
                                             (2, '张三', '123456'),
                                             (3, '李四', '123456');

CREATE TABLE `teacher` (
                           `id` INT(10) NOT NULL,
                           `name` VARCHAR(30) DEFAULT NULL,
                           PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

INSERT INTO teacher(`id`, `name`) VALUES (1, "秦老师");

CREATE TABLE `student` (
                           `id` INT(10) NOT NULL,
                           `name` VARCHAR(30) DEFAULT NULL,
                           `tid` INT(10) DEFAULT NULL,
                           PRIMARY KEY (`id`),
                           KEY `fktid` (`tid`),
                           CONSTRAINT `fktid` FOREIGN KEY (`tid`) REFERENCES `teacher` (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;
INSERT INTO `student` (`id`, `name`, `tid`) VALUES (1, "小明", 1);
INSERT INTO `student` (`id`, `name`, `tid`) VALUES (2, "小红", 1);
INSERT INTO `student` (`id`, `name`, `tid`) VALUES (3, "小张", 1);
INSERT INTO `student` (`id`, `name`, `tid`) VALUES (4, "小李", 1);
INSERT INTO `student` (`id`, `name`, `tid`) VALUES (5, "小王", 1);