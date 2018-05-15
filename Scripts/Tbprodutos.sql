use firesmoke;



create table tbprodutos(

id int primary key not null auto_increment,

nome varchar(30),

tipo varchar(20),

marca varchar(20),

sku varchar(20) unique,

precovenda varchar(30),

precocompra varchar(30),

quantidade int
);

insert into tbprodutos (nome, tipo, marca, sku, precovenda, precocompra, quantidade)
value ('zomo watermelon  mint', 'essencia', 'zomo', '1', '10,00', '6,50', '40');

insert into tbprodutos (nome, tipo, marca, sku, precovenda, precocompra, quantidade)
value ('zomo guava', 'essencia', 'zomo', '2', '10,00', '6,50', '20');

insert into tbprodutos (nome, tipo, marca, sku, precovenda, precocompra, quantidade)
value ('adalya swiss bombom', 'essencia', 'adalya', '3', '16,00', '9,50', '10');

insert into tbprodutos (nome, tipo, marca, sku, precovenda, precocompra, quantidade)
value ('vgod mint', 'essencia', 'vgod', '4', '12,00', '8,00', '30');

insert into tbprodutos (nome, tipo, marca, sku, precovenda, precocompra, quantidade)
value ('tangiers new lemon lime', 'essencia', 'tangiers', '5', '150,00', '95,00', '1');

insert into tbprodutos (nome, tipo, marca, sku, precovenda, precocompra, quantidade)
value ('regal queen', 'stem', 'regal hookah', '6', '1100,00', '850,00', '2');

insert into tbprodutos (nome, tipo, marca, sku, precovenda, precocompra, quantidade)
value ('boho yunan rubi', 'vaso', 'egermann', '7', '510,00', '350,00', '3');

insert into tbprodutos (nome, tipo, marca, sku, precovenda, precocompra, quantidade)
value ('imperial hk', 'prato', 'hookah king', '8', '150,00', '100,00', '5');


select * from tbprodutos;