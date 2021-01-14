-- criar um banco de dados
create database db_registro_escolar;

-- acesso ao db
use db_registro_escolar;

-- criar uma tabela
create table tb_alunos (
matricula bigint(5) auto_increment,
nome varchar(200) not null,
turma varchar(50) not null,
periodo varchar (50) not null,
nota_media float not null,
primary key(matricula)
);

-- inserir dados na tabela
insert into tb_alunos (nome,turma,periodo,nota_media) values ("Daniel Augusto","9ºB", "Manhã", 4.5);
insert into tb_alunos (nome,turma,periodo,nota_media) values ("Danilo Pereira","5ºB", "Tarde", 6.0);
insert into tb_alunos (nome,turma,periodo,nota_media) values ("Gustavo Rabelo","9ºB", "Manhã", 8.5);
insert into tb_alunos (nome,turma,periodo,nota_media) values ("Luiz Felipe Magalhães","9ºA", "Manhã", 3.0);
insert into tb_alunos (nome,turma,periodo,nota_media) values ("Marcos Eduardo","6ºC", "Tarde", 7.5);
insert into tb_alunos (nome,turma,periodo,nota_media) values ("Beatriz Martins","9ºA", "Manhã", 10);
insert into tb_alunos (nome,turma,periodo,nota_media) values ("Danilo Mendes","7ºA", "Manhã", 4.0);
insert into tb_alunos (nome,turma,periodo,nota_media) values ("Rafaela Oliveira","5ºA", "Tarde", 8.0);

-- busca da tabela funcionario
select * from tb_alunos;

-- busca da tabela alunos com nota maior que 7
select * from tb_alunos where nota_media > 7;

-- busca da tabela alunos com nota menor que 7
select * from tb_alunos where nota_media < 7;

-- atualizar dados na tabela
update tb_alunos set nota_media = 7.5 where matricula = 4;