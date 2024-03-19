drop table if exists player;

create table player (
    id serial primary key,
    name varchar(255) not null,
    team_name varchar(100) not null,
    role varchar(100) not null,
    amount float not null
);