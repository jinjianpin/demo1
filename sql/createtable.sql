use sys;
use db1;

create table menuitem(
menuid integer,  
menuname varchar(100),
menutype varchar(100),
price1 decimal(12,2),
price2 decimal(12,2),
description varchar(1000),
photo1 varchar(200),
photo2 varchar(200)
);
alter database db1 charset utf8;
insert into menuitem
values(1,'红烧牛肉','主食',28,25,'高级牛肉精选，味道鲜美。。。'
,'/photo1.jpg','/photo2.jpg');

show variables like '%character%';

select * from menuitem;

-----------------
create table t_user(
id int(12) not null auto_increment,
user_name varchar(60),
sex int(3) not null default 1 check(sex in (1,2)),
note varchar(255) null,
primary key(id)
);
