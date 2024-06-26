create table if not exists contact_details(
    cid uuid,
    name varchar(250) not null,
    email varchar(250) not null,
    mobile varchar(10) not null,
    primary key(cid)
);

create table app_user(
    id uuid,
    name varchar(250) not null,
    email varchar(250) unique not null,
    password varchar(250) not null,
    deleted boolean default false,
    created_at timestamp without time zone,
    updated_at timestamp without time zone,
    primary key(id)

);

create table if not exists player_details(
    id UUID,
    name varchar(255),
    role varchar(255),
    country varchar(255),
    team varchar(255),
    amount float,
    primary key(id)
);
