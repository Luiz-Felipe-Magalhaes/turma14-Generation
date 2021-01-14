-- criar um banco de dados
create database db_rh_empresa;

-- acesso ao db
use db_rh_empresa;

-- criar uma tabela
create table tb_funcionarios (
id bigint(5) auto_increment,
nome varchar(200) not null,
cargo varchar(50) not null,
filial varchar (50) not null,
salario float not null,
primary key(id)
);

-- busca da tabela funcionario
select * from tb_funcionarios;

-- inserir dados na tabela
insert into tb_funcionarios (nome,cargo,filial,salario) values ("Daniel Augusto","Desenvolvedor Junior", "Canadá", 4200);
insert into tb_funcionarios (nome,cargo,filial,salario) values ("Danilo Pereira","Estagiario de Engenharia de Software", "Brasil", 1950);
insert into tb_funcionarios (nome,cargo,filial,salario) values ("Gustavo Rabelo","Engenheiro de Software Pleno", "Portugal", 12170);
insert into tb_funcionarios (nome,cargo,filial,salario) values ("Luiz Felipe Magalhães","Estagiario de Engenharia de Software", "Canadá", 1950);
insert into tb_funcionarios (nome,cargo,filial,salario) values ("Marcos Eduardo","Desenvolvedor Pleno", "Brasil", 7350);

-- busca da tabela funcionario com salario maior que 2000
select * from tb_funcionarios where salario > 2000;

-- busca da tabela funcionario com salario menor que 2000
select * from tb_funcionarios where salario < 2000;

-- atualizar dados na tabela
update  tb_funcionarios set cargo = "Engenheiro de Software Junior", salario = 9500 where id = 4;

