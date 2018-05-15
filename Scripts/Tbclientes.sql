create database firesmoke;

use firesmoke;



create table tbclientes (
id int primary key not null auto_increment,

nome varchar(30) not null,

cpf varchar(20) unique not null,

email varchar(50),

fone varchar(15),

dtnascimento varchar(10));


insert into tbclientes (nome, cpf, email, fone, dtnascimento)
value ('Guilherme de Moura Feitosa', '483.829.858-74', 'gfeitosa@alelo.com.br','96051-8717','18/08/1997');

insert into tbclientes (nome, cpf, email, fone, dtnascimento)
value ('Gabriel Gomes Martins', '476.507.118.97', 'gabriel-g-martins@hotmail.com', '95231-1865', '10/10/1997');

insert into tbclientes (nome, cpf, email, fone, dtnascimento)
value ('Gabriel Rego Silva', '416.243.768-86', 'gabrielrsilva1004@gmail.com', '97368-0070', '10/04/1997');

insert into tbclientes (nome, cpf, email, fone, dtnascimento)
value ('Marcelo Panucci', '322.846.118-18', 'marcelo.panuci@diagroup.com', '98657-0307', '26/12/1997');

insert into tbclientes (nome, cpf, email, fone, dtnascimento)
value ('Cibele Festa Perez', '142.872.518-06', 'cibele.festa.perez@diagroup.com', '98411-4820', '11/08/1972');

insert into tbclientes (nome, cpf, email, fone, dtnascimento)
value ('Matheus Nascimento', '467.606.048-30', 'matheus.nascimento@gaapbrasil.com.br', '99263-8250', '12/06/1996');




describe tbclientes;