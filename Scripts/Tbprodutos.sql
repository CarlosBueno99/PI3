use firesmoke;



create table tbprodutos(

id int primary key not null auto_increment,

nome varchar(30),

tipo varchar(20),

marca varchar(20),

sku varchar(20) unique,

precovenda varchar(30)
);

insert into tbprodutos(nome, tipo, marca, sku, precovenda)
value ('X', 'mangueira', 'triton','triton_X', '75.00');

insert into tbprodutos(nome, tipo, marca, sku, precovenda)
value ('invoke', 'rosh', 'mahalla','mahalla_invoke', '35.00');

insert into tbprodutos(nome, tipo, marca, sku, precovenda)
value ('aluminio', 'aluminio', 'predator','predator_aluminio', '15.00');

insert into tbprodutos(nome, tipo, marca, sku, precovenda)
value ('orange', 'essencia', 'mazaya','orange_mazaya', '9.00');

insert into tbprodutos(nome, tipo, marca, sku, precovenda)
value ('pinepas', 'essencia', 'tangiers','tangiers_pinepas', '150.00');

insert into tbprodutos(nome, tipo, marca, sku, precovenda)
value ('guava', 'essencia', 'zomo','zomo_guava', '11.00');

insert into tbprodutos(nome, tipo, marca, sku, precovenda)
value ('grape', 'essencia', 'zomo','zomo_grape', '11.00');

insert into tbprodutos(nome, tipo, marca, sku, precovenda)
value ('mint', 'essencia', 'zomo','zomo_mint', '11.00');


select * from tbprodutos;