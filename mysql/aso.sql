create database if not exists fiapdb;
use fiapdb;

create table if not exists ALUNO(rm int(6) primary key, nome varchar(60) not null, email varchar(60));

insert into ALUNO(rm, nome, email) values(123456, 'Ewerton Vieira Donati', 'teste@teste.com');
insert into ALUNO(rm, nome, email) values(234567, 'Henrique Alexandre', 'teste@teste.com');
insert into ALUNO(rm, nome, email) values(345678, 'José Carlos', 'teste@teste.com');
insert into ALUNO(rm, nome, email) values(456789, 'Stanley Silva', 'teste@teste.com');