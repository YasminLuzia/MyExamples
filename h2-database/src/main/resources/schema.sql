drop table if exists employee;

create table employee(
    id_employee bigint auto_increment,
    name varchar(100) not null,
    salary double not null,
    rg int not null,
    primary key(id_employee));