use firesmoke;

INSERT tbcomanda (valortotal,statuspagamento)values(100.00,false);
SELECT * FROM tbcomanda;
select * from tbprodutos;
SELECT * FROM tbclientes;


INSERT tbcomandaproduto (idcomanda,skuproduto,quantidade)values(1,'haze_pacoca',10);
INSERT tbcomandaproduto (idcomanda,skuproduto,quantidade)values(1,5,10);
INSERT tbcomandaproduto (idcomanda,skuproduto,quantidade)values(1,3,10);
INSERT tbcomandaproduto (idcomanda,skuproduto,quantidade)values(1,4,10);

SELECT tbcomandaproduto.idcomanda
     , tbcomandaproduto.quantidade
	 , tbprodutos.sku
     , tbprodutos.nome
	 , tbprodutos.tipo
     , tbprodutos.marca
     , tbprodutos.precovenda
  FROM tbcomandaproduto
	   INNER JOIN tbprodutos ON tbprodutos.sku = tbcomandaproduto.skuproduto
 WHERE tbcomandaproduto.idcomanda = 25;

select * from tbprodutos;
use firesmoke;
select * from tbcomanda;

Select idcomanda from tbcomanda order by idcomanda desc limit 1;


select * from tbcomandaproduto;
use firesmoke;