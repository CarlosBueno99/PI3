create table tbfuncionarios(
id int primary key not null auto_increment,
nome varchar(30),
cpf varchar(20) unique,
cargo varchar(20),
endereco varchar(50),
dtnascimento varchar(10)
);

