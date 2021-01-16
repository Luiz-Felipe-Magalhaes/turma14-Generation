-- criar banco de dados
create database db_farmacia_do_bem;

-- acesso ao db
use db_farmacia_do_bem;

-- criar tabela categoria
create table tb_categoria (
codigo_categoria bigint(5),
nome_categoria varchar(30) not null,
departamento varchar(30) not null,

primary key (nome_categoria)
);

-- inseri dados na tabela categoria
insert into tb_categoria (codigo_categoria,nome_categoria, departamento) values (1,"anti-depressivo","medicamento");
insert into tb_categoria (codigo_categoria,nome_categoria, departamento) values (2,"generico","medicamento");
insert into tb_categoria (codigo_categoria,nome_categoria, departamento) values (3,"vitamina","saude e bem-estar");
insert into tb_categoria (codigo_categoria,nome_categoria, departamento) values (4,"suplemento","saude e bem-estar");
insert into tb_categoria (codigo_categoria,nome_categoria, departamento) values (5,"fraldas","infantil");

-- busca da tabela categoria
select * from tb_categoria;

-- criar tabela produto
create table tb_produto (
codigo_produto bigint(5) auto_increment,
nome varchar (30) not null,
preco decimal (5,2) not null,
quantidade_estoque bigint (5) not null,
tipo varchar (30) not null,

primary key (codigo_produto),
foreign key (tipo) references tb_categoria (nome_categoria)
);

-- inseri dados na tabela produto
insert into tb_produto (nome, preco, quantidade_estoque, tipo) values ("Benicar 20mg",58.95,90,"anti-depressivo");
insert into tb_produto (nome, preco, quantidade_estoque, tipo) values ("Sekozok 50mg", 87.29,74,"anti-depressivo");
insert into tb_produto (nome, preco, quantidade_estoque, tipo) values ("Nimesulida 100mg",7.49,120,"generico");
insert into tb_produto (nome, preco, quantidade_estoque, tipo) values ("Prednisona 20mg",33.49,77,"generico");
insert into tb_produto (nome, preco, quantidade_estoque, tipo) values ("Vitamina D Provicta",27.49,58,"vitamina");
insert into tb_produto (nome, preco, quantidade_estoque, tipo) values ("Vitamina C Cenevit",30.49,50,"vitamina");
insert into tb_produto (nome, preco, quantidade_estoque, tipo) values ("Ensure",167.99,40,"suplemento");
insert into tb_produto (nome, preco, quantidade_estoque, tipo) values ("Fralda Pampers",79.90,240,"fraldas");

-- busca da tabela pizza
select * from tb_produto;

-- buscas por valores dos atributos
select * from tb_produto where preco > 50;

select * from tb_produto where preco > 3 and preco < 60;

-- busca com like
select * from tb_produto where nome like 'b%';

-- inner join 
select * from tb_categoria inner join tb_produto on tb_categoria.nome_categoria = tb_produto.tipo;

-- inner join com where
select * from tb_categoria inner join tb_produto on tb_categoria.nome_categoria = tb_produto.tipo where tb_categoria.nome_categoria = "generico";








