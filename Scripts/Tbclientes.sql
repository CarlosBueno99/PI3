create database firesmoke;

use firesmoke;

create table tbclientes (
id int primary key not null auto_increment,
nome varchar(30) not null,
cpf varchar(20) unique not null,
email varchar(30),
fone varchar(15),
dtnascimento varchar(10));

insert into tbclientes (nome, cpf, email, fone, dtnascimento)
value ('Guilherme de Moura Feitosa', '483.829.858-74', 'gfeitosa@alelo.com.br','96051-8717','18/08/1997');

describe tbclientes;