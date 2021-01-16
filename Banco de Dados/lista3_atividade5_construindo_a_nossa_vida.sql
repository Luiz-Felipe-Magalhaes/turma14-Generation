-- criar banco de dados
create database db_construindo_a_nossa_vida;

-- acesso ao db
use db_construindo_a_nossa_vida;

-- criar tabela categoria
create table tb_categoria (
codigo_categoria bigint(5),
nome_categoria varchar(30) not null,
departamento varchar(30) not null,

primary key (nome_categoria)
);

-- inseri dados na tabela categoria
insert into tb_categoria (codigo_categoria,nome_categoria, departamento) values (1,"pisos","material de construção");
insert into tb_categoria (codigo_categoria,nome_categoria, departamento) values (2,"argamassas","material de construção");
insert into tb_categoria (codigo_categoria,nome_categoria, departamento) values (3,"tubos e conexões","material hidraulico");
insert into tb_categoria (codigo_categoria,nome_categoria, departamento) values (4,"cabos eletricos","material eletrico");
insert into tb_categoria (codigo_categoria,nome_categoria, departamento) values (5,"luminarias","iluminação");

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
insert into tb_produto (nome, preco, quantidade_estoque, tipo) values ("piso porcelanato 60x60",40.99,90,"pisos");
insert into tb_produto (nome, preco, quantidade_estoque, tipo) values ("piso ceramico 45x45", 22.99,74,"pisos");
insert into tb_produto (nome, preco, quantidade_estoque, tipo) values ("argamassa colante piso interno",16,120,"argamassas");
insert into tb_produto (nome, preco, quantidade_estoque, tipo) values ("cimento cp II E",27,77,"argamassas");
insert into tb_produto (nome, preco, quantidade_estoque, tipo) values ("tubo de esgoto 100mm",48.99,240,"tubos e conexões");
insert into tb_produto (nome, preco, quantidade_estoque, tipo) values ("cabo flexivel 2,5mm",120,213,"cabos eletricos");
insert into tb_produto (nome, preco, quantidade_estoque, tipo) values ("cabo flexivel 4,0mm",359,40,"cabos eletricos");
insert into tb_produto (nome, preco, quantidade_estoque, tipo) values ("plafon embutido",11,50,"luminarias");

-- busca da tabela pizza
select * from tb_produto;

-- buscas por valores dos atributos
select * from tb_produto where preco > 50;

select * from tb_produto where preco > 3 and preco < 60;

-- busca com like
select * from tb_produto where nome like 'c%';

-- inner join 
select * from tb_categoria inner join tb_produto on tb_categoria.nome_categoria = tb_produto.tipo;

-- inner join com where
select * from tb_categoria inner join tb_produto on tb_categoria.nome_categoria = tb_produto.tipo where tb_categoria.nome_categoria = "pisos";








