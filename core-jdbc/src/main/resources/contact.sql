
drop table if exists contact;

create table contact (
  id serial primary key,
  name varchar(255),
  email varchar(255),
  mobile varchar(10)
);