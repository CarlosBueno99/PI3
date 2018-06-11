create table tbfuncionarios(

id int primary key not null auto_increment,

nome varchar(30),

cpf varchar(20) unique,

cargo varchar(20),

endereco varchar(50),

dtnascimento varchar(10));



insert into tbfuncionarios (nome, cpf, cargo, endereco, dtnascimento)
value ('Carlos Bueno', '434.891.278-54', 'atendente', 'rua nino crespi, 109', '12/10/1999');

insert into tbfuncionarios (nome, cpf, cargo, endereco, dtnascimento)
value ('Amanda Saraiva Gaia', '441.261.198-17', 'atendente', 'rua leningrado, 97', '07/02/1996');

insert into tbfuncionarios (nome, cpf, cargo, endereco, dtnascimento)
value ('Arthur Xavier', '418.509.178-84', 'gerente', 'rua liz das lagoa, 33', '02/04/1997');

describe tbclientes;