-- criar um banco de dados
create database db_generation_game_online;

-- acesso ao db
use db_generation_game_online;

-- cria tabela classe
create table tb_classe(
nome_classe varchar(30) not null,
funcao varchar(100) not null,
tipo varchar (10) not null,
primary key(nome_classe)
);

-- inseri dados na tabela classe
insert into tb_classe (nome_classe, funcao, tipo) values ("Assassino","Causar dano a inimigos na retaguarda","Ataque");
insert into tb_classe (nome_classe, funcao, tipo) values ("Caçador","Causar dano a inimigos com menos vida","Ataque");
insert into tb_classe (nome_classe, funcao, tipo) values ("Duelista","Aumentar a velocidade de ataque e movimento","Ataque");
insert into tb_classe (nome_classe, funcao, tipo) values ("Mago","Conjurar habilidades de ataque e defesa","Hibrido");
insert into tb_classe (nome_classe, funcao, tipo) values ("Patrono","Conceder escudo a ele mesmo e/ou a um aliado","Defesa");

-- busca da tabela classe
select * from tb_classe;

-- cria tabela personagem
create table tb_personagem(
nome_personagem varchar(30) not null,
classe varchar(30) not null,
habilidade varchar (100) not null,
ataque bigint(4) not null,
defesa bigint(4) not null,

primary key(nome_personagem),
foreign key (classe) references tb_classe (nome_classe)
);

-- inseri dados na tabela personagem
insert into tb_personagem (nome_personagem, classe, habilidade, ataque, defesa) values ("Pyke","Assassino","Paralisar e executar inimigos com menos de 30% de vida",2700,900);
insert into tb_personagem (nome_personagem, classe, habilidade, ataque, defesa) values ("Katarina","Assassino","Causar dano em multiplos inimigos proximos ",3100,700);
insert into tb_personagem (nome_personagem, classe, habilidade, ataque, defesa) values ("Kindred","Caçador","Ficar ivuneravel a dano por 4 segundos",2200,1100);
insert into tb_personagem (nome_personagem, classe, habilidade, ataque, defesa) values ("Camille","Duelista","Paralisar e causar dano a multiplos inimigos proximos ",1900,1250);
insert into tb_personagem (nome_personagem, classe, habilidade, ataque, defesa) values ("Yasuo","Duelista","Atacar os inimigos com um furacão",3300,850);
insert into tb_personagem (nome_personagem, classe, habilidade, ataque, defesa) values ("Veigar","Mago","Conjurar um cometa magico que causa dano em area",2100,1150);
insert into tb_personagem (nome_personagem, classe, habilidade, ataque, defesa) values ("Annie","Mago","Conjurar um urso que ataca os inimigos",1700,1400);
insert into tb_personagem (nome_personagem, classe, habilidade, ataque, defesa) values ("Riven","Patrono","Ganha um escudo ao se movimentar e atacar inimigos",1100,2050);

-- busca da tabela personagem
select * from tb_personagem;

-- buscas por valores dos atributos
select * from tb_personagem where ataque > 2000;

select * from tb_personagem where defesa > 1000 and defesa < 2000;

-- busca com like
select * from tb_personagem where nome_personagem like 'c%';

-- inner join
select * from tb_classe inner join tb_personagem on tb_personagem.classe = tb_classe.nome_classe;

-- inner join com where
select * from tb_classe inner join tb_personagem on tb_personagem.classe = tb_classe.nome_classe where tb_classe.nome_classe = "Duelista"; 









