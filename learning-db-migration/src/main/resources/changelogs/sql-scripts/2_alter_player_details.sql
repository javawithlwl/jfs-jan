alter table if exists player_details add column if not exists deleted boolean default false;
alter table if exists player_details add column if not exists created_date timestamp without time zone;
alter table if exists player_details add column if not exists modified_date timestamp without time zone;
