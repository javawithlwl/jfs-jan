drop table if exists user_details;
create table if not exists user_details(
    id uuid primary key,
    first_name varchar(255),
    last_name varchar(255),
    email varchar(255),
    password varchar(255),
    created_date timestamp without time zone,
    modified_date timestamp without time zone,
    deleted boolean default false
);
