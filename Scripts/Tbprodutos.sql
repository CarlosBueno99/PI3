use firesmoke;

create table tbprodutos(
id int primary key not null auto_increment,
nome varchar(30),
tipo varchar(20),
marca varchar(20),
sku varchar(20),
precovenda double,
precocompra double);



select * from tbprodutos;