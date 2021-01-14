create database db_produtos_ecommerce;

-- acesso ao db 
use db_produtos_ecommerce;

-- criar uma tabela
create table tb_produtos (
codigo bigint(5) auto_increment,
nome varchar(100) not null,
preco decimal (10,2) not null,
categoria varchar(50) not null,
qtd_em_estoque int not null,
primary key(codigo)
);

-- inserir dados na tabela
insert into tb_produtos (nome,preco,categoria,qtd_em_estoque) values ("Camiseta", 60, "Masculino", 15);
insert into tb_produtos (nome,preco,categoria,qtd_em_estoque) values ("Sapato", 120, "Masculino", 5);
insert into tb_produtos (nome,preco,categoria,qtd_em_estoque) values ("Vestido", 80, "Infantil", 12);
insert into tb_produtos (nome,preco,categoria,qtd_em_estoque) values ("Calça Jeans", 150, "Feminino", 17);
insert into tb_produtos (nome,preco,categoria,qtd_em_estoque) values ("Vestido", 100, "Feminino", 9);
insert into tb_produtos (nome,preco,categoria,qtd_em_estoque) values ("Sapato", 150, "Feminino", 4);
insert into tb_produtos (nome,preco,categoria,qtd_em_estoque) values ("Jaqueta", 200, "Feminina", 3);
insert into tb_produtos (nome,preco,categoria,qtd_em_estoque) values ("Bermuda", 50, "Masculina", 7);

-- busca da tabela produtos
select * from tb_produtos;

-- busca da tabela produtos com preço maior que 500
select * from tb_produtos where preco > 500;

-- busca da tabela produtos com preço menor que 500
select * from tb_produtos where preco < 500;

-- atualizar dados na tabela
update  tb_produtos set qtd_em_estoque = 13 where codigo = 1;







