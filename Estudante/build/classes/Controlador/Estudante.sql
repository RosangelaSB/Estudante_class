create database estudante;
use estudante;
create table estudante(
id int primary key auto_increment not null,
nome varchar(255) not null,
curso varchar(255) not null,
disciplina varchar(255) not null,
ano int not null
)

show tables;
select * from estudante;
