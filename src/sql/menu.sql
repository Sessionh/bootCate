drop table if exists menu_type;
create  table menu_type (
  `id` int(11) not null AUTO_INCREMENT,   #用户唯一ID
  `name` varchar(100) DEFAULT NULL, #菜单名
  `subId` int(11),
  unique key `name`(`name`, `subId`) USING BTREE,
  primary key (`id`)
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into `menu_type` values(1, '热门', 1);
insert into `menu_type` values(2, '蔬菜', 2);
insert into `menu_type` values(3, '肉类大全', 3);
insert into `menu_type` values(4, '主食', 4);
insert into `menu_type` values(5, '菜式菜系', 5);
insert into `menu_type` values(6, '烘焙', 6);
insert into `menu_type` values(7, '水产海鲜', 7);
insert into `menu_type` values(8, '蛋奶豆制品', 8);
insert into `menu_type` values(9, '烹饪方法', 9);
insert into `menu_type` values(10, '食疗养生', 10);
insert into `menu_type` values(11, '母婴', 11);
insert into `menu_type` values(12, '米面杂粮', 12);
insert into `menu_type` values(13, '厨具', 13);
insert into `menu_type` values(14, '口味', 14);

drop table if exists menu_type_sub;
create table `menu_type_sub` (
  `id` int(11) not null AUTO_INCREMENT,
  `title` varchar(100) DEFAULT NULL, #标题
  `menuTypeId` int(11), #menu_type表 id
  unique key `title`(`title`) USING BTREE,
  primary key (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into `menu_type_sub` values(1, '热门食材', 1);
insert into `menu_type_sub` values(2, '家常菜', 1);
insert into `menu_type_sub` values(3, '下饭菜', 1);
insert into `menu_type_sub` values(4, '减肥食谱', 1);





drop table if exists menu_type_sub_text;
create table `menu_type_sub_text` (
  `id` int(11) not null AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL, #标题
  `uId` int(11), #父id
  unique key `name`(`name`) USING BTREE,
  primary key (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


insert into `menu_type_sub_text` values(1, '面条', 1);
insert into `menu_type_sub_text` values(2, '牛肉', 1);
insert into `menu_type_sub_text` values(3, '豆腐', 1);
insert into `menu_type_sub_text` values(4, '虾', 1);
insert into `menu_type_sub_text` values(5, '排骨', 1);
insert into `menu_type_sub_text` values(6, '土豆', 1);
insert into `menu_type_sub_text` values(7, '鸡蛋', 1);
insert into `menu_type_sub_text` values(8, '羊肉', 1);
insert into `menu_type_sub_text` values(9, '茄子', 1);

insert into `menu_type_sub_text` values(10, '可乐鸡翅', 2);
insert into `menu_type_sub_text` values(11, '红烧肉', 2);
insert into `menu_type_sub_text` values(12, '糖醋排骨', 2);
insert into `menu_type_sub_text` values(13, '鱼香肉丝', 2);
insert into `menu_type_sub_text` values(14, '红烧排骨', 2);
insert into `menu_type_sub_text` values(15, '油焖大虾', 2);
insert into `menu_type_sub_text` values(16, '清蒸鲈鱼', 2);
insert into `menu_type_sub_text` values(18, '酸菜鱼', 2);

insert into `menu_type_sub_text` values(19, '家常菜', 3);
insert into `menu_type_sub_text` values(20, '宫保鸡丁', 3);
insert into `menu_type_sub_text` values(21, '糖醋里脊', 3);
insert into `menu_type_sub_text` values(22, '年夜饭', 3);
insert into `menu_type_sub_text` values(23, '京酱肉丝', 3);
insert into `menu_type_sub_text` values(24, '水煮肉片', 3);
insert into `menu_type_sub_text` values(25, '麻婆豆腐', 3);
insert into `menu_type_sub_text` values(26, '锅包肉', 3);


insert into `menu_type_sub_text` values(28, '沙拉', 4);
insert into `menu_type_sub_text` values(29, '薏米', 4);
insert into `menu_type_sub_text` values(30, '红豆', 4);
insert into `menu_type_sub_text` values(31, '芹菜', 4);
insert into `menu_type_sub_text` values(32, '冬瓜', 4);
insert into `menu_type_sub_text` values(33, '黄瓜', 4);
insert into `menu_type_sub_text` values(34, '番茄', 4);
insert into `menu_type_sub_text` values(35, '生菜', 4);
insert into `menu_type_sub_text` values(36, '西兰花', 4);
insert into `menu_type_sub_text` values(37, '卷心菜', 4);
insert into `menu_type_sub_text` values(38, '苦瓜', 4);
insert into `menu_type_sub_text` values(39, '馒头', 4);
insert into `menu_type_sub_text` values(41, '饺子', 4);
insert into `menu_type_sub_text` values(42, '烤红薯', 4);
insert into `menu_type_sub_text` values(43, '宝宝辅食', 4);
insert into `menu_type_sub_text` values(44, '鲫鱼豆腐汤', 4);
insert into `menu_type_sub_text` values(46, '鲫鱼汤', 4);

