
drop table if exists contact;

create table contact (
  cid serial primary key,
  name varchar(255),
  email varchar(255),
  mobile varchar(10)
);