drop table if exists users;

create table users(
    id_users bigint auto_increment not null,
    name varchar(120) not null,
    age int null,
    primary key (id_users));