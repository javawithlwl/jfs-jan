create table if not exists player_details(
    id uuid primary key,
    name varchar(255),
    team varchar(255),
    role varchar(255),
    amount float
);