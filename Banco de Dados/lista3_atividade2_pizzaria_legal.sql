-- criar banco de dados
create database db_pizzaria_legal;

-- acesso ao db
use db_pizzaria_legal;

-- criar tabela categoria
create table tb_categoria (
nome_categoria varchar(30) not null,
entrega_disponivel boolean not null,
promocao_ativa boolean not null,

primary key (nome_categoria)
);

-- inseri dados na tabela categoria
insert into tb_categoria (nome_categoria, promocao_ativa, entrega_disponivel) values ("pizza salgada",true,true);
insert into tb_categoria (nome_categoria, promocao_ativa, entrega_disponivel) values ("pizza doce",false,true);
insert into tb_categoria (nome_categoria, promocao_ativa, entrega_disponivel) values ("esfirra",false,true);
insert into tb_categoria (nome_categoria, promocao_ativa, entrega_disponivel) values ("sobremesa",false,false);
insert into tb_categoria (nome_categoria, promocao_ativa, entrega_disponivel) values ("bebida",true,true);

-- busca da tabela categoria
select * from tb_categoria;

-- criar tabela pizza
create table tb_pizza (
codigo bigint (5) auto_increment,
nome varchar (30) not null,
preco decimal (5,2) not null,
quantidade_estoque bigint (4) not null,
tipo varchar (30) not null,

primary key (codigo),
foreign key (tipo) references tb_categoria (nome_categoria)
); 

-- inseri dados na tabela pizza
insert into tb_pizza (nome,preco,quantidade_estoque,tipo) values ("catupiry", 40.50, 80, "pizza salgada");
insert into tb_pizza (nome,preco,quantidade_estoque,tipo) values ("napolitana", 47, 50, "pizza salgada");
insert into tb_pizza (nome,preco,quantidade_estoque,tipo) values ("mussarela", 35, 120, "pizza salgada");
insert into tb_pizza (nome,preco,quantidade_estoque,tipo) values ("calabresa", 3, 250, "esfirra");
insert into tb_pizza (nome,preco,quantidade_estoque,tipo) values ("prestigio", 50, 65, "pizza doce");
insert into tb_pizza (nome,preco,quantidade_estoque,tipo) values ("brigadeiro", 50.99, 63, "pizza doce");
insert into tb_pizza (nome,preco,quantidade_estoque,tipo) values ("sorvete", 20, 80, "sobremesa");
insert into tb_pizza (nome,preco,quantidade_estoque,tipo) values ("suco de laranja", 8, 104, "bebida");

-- busca da tabela pizza
select * from tb_pizza;

-- buscas por valores dos atributos
select * from tb_pizza where preco > 45;

select * from tb_pizza where preco > 29 and preco < 60;

-- busca com like
select * from tb_pizza where nome like 'c%';

-- inner join
select * from tb_categoria inner join tb_pizza on tb_pizza.tipo = tb_categoria.nome_categoria;

-- inner join com where
select * from tb_categoria inner join tb_pizza on tb_pizza.tipo = tb_categoria.nome_categoria where tb_categoria.nome_categoria = "pizza salgada"; 











