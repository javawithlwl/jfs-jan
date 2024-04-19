create table if not exists contact_details(
    cid binary(16),
    name varchar(250) not null,
    email varchar(250) not null,
    mobile varchar(10) not null,
    primary key(cid)
);