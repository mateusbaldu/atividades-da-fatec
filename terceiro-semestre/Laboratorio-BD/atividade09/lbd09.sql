drop database biblioteca;

create database biblioteca;
use biblioteca;

create table categorialeitor (
    codigo int primary key,
    nome varchar(100),
    dias int default 7
);

create table categoriaobra (
    codigo int primary key,
    nome varchar(100)
);

create table funcionario (
    codigo bigint primary key auto_increment,
    nome varchar(100) not null,
    documento varchar(30) not null,
    email varchar(100) not null unique,
    telefone varchar(30),
    cidade varchar(100),
    logradouro varchar(100),
    cep char(9),
    senha varchar(100),
    cargo varchar(50)
);

create table leitor (
    codigo bigint primary key auto_increment,
    nome varchar(100) not null,
    documento varchar(30) not null,
    email varchar(100) not null unique,
    telefone varchar(30),
    cidade varchar(100),
    logradouro varchar(100),
    cep char(9),
    senha varchar(100),
    categorialeitor int
);

create table obra (
    codigo bigint primary key auto_increment,
    titulo varchar(100) not null,
    autor varchar(100),
    isbn varchar(30) unique,
    editora varchar(100),
    ano char(4),
    sinopse text,
    palavraschave varchar(100),
    categoriaobra int
);

create table copia (
    codigo bigint primary key auto_increment,
    codigoobra bigint, 
    descritivo varchar(1000),
    disponivel varchar(10) default 'não'
);

create table reserva (
    codigo bigint primary key auto_increment,
    datareserva date,
    dataretirada date,
    dataprevista date,
    leitor bigint,
    obra bigint
);

create table emprestimo (
    codigo bigint primary key auto_increment,
    dataemprestimo date,
    dataprevista date, 
    datadevolucao date,
    multa decimal(10,2) default 0,
    leitor bigint,
    copia bigint,
    funcionario bigint
);


alter table leitor add foreign key (categorialeitor) references categorialeitor(codigo);
alter table obra add foreign key (categoriaobra) references categoriaobra(codigo);
alter table copia add foreign key (codigoobra) references obra(codigo);
alter table reserva add foreign key (leitor) references leitor(codigo);
alter table reserva add foreign key (obra) references obra(codigo);
alter table emprestimo add foreign key (leitor) references leitor(codigo);
alter table emprestimo add foreign key (copia) references copia(codigo);
alter table emprestimo add foreign key (funcionario) references funcionario(codigo);


start transaction;

insert into categorialeitor (codigo, nome, dias) values 
(1, 'Aluno', 3),
(2, 'Professor', 4),
(3, 'Visitante', 5);

insert into categoriaobra (codigo, nome) values 
(1, 'Romance'),
(33, 'Mangá de ação'),
(34, 'Mangá coreano de ação');

insert into funcionario (codigo, nome, documento, email, telefone, cidade, logradouro, cep, senha, cargo) values
(1, 'Mateus Balduíno', '012.345.678-99', 'mateusficticio@email.com', '11912344321', 'São Paulo', 'Rua Ficticia, 1', '01234-000', '123456', 'Bibliotecario'),
(2, 'Vitor Dahora', '333.345.678-99', 'vitorficticio@email.com', '11912341111', 'São Paulo', 'Rua Ficticia, 2', '01234-000', '123456',  'Bibliotecario'),
(3, 'Gabriel Ribeiro', '012.444.678-99', 'gabrielficticio@email.com', '11977774321', 'São Paulo', 'Rua Ficticia, 8', '01234-001', '123456',  'Bibliotecario');

insert into leitor (codigo, nome, documento, email, telefone, cidade, logradouro, cep, senha, categorialeitor) values 
(1, 'Luccas Miguel', '012.345.876-99', 'luccasficticio@email.com', '11912347721', 'São Paulo', 'Rua Ficticia, 6', '01234-000', '123456', 1),
(2, 'Miguel Henrique', '111.345.678-99', 'miguelficticio@email.com', '11912888321', 'São Paulo', 'Rua Ficticia, 22', '01234-001', '123456', 2),
(3, 'Pedro Dantas', '012.345.222-99', 'pedroficticio@email.com', '11977884321', 'São Paulo', 'Rua Ficticia, 23', '01234-001', '123456', 3);

insert into obra (codigo, titulo, autor, isbn, editora, ano, sinopse, palavraschave, categoriaobra) values 
(1, 'Crepusculo', 'random', '34588-9888C', 'Crepusculo FC', '2009', 'insira texto', 'vampiro', 1),
(2, 'Solo Levelling', 'random', '34588-9111C', 'insira texto', '2020', 'insira texto', 'videogames', 34),
(3, 'Steins;Gate', 'random', '36699-1111J', 'random', '2020', 'insira texto', 'vampiro', 1);

insert into copia (codigo, codigoobra, descritivo, disponivel) values 
(1, 1, 'Primeira edição', 'sim'),
(2, 2, 'Edição de colecionador', 'não'),
(3, 3, 'Capa dura', 'sim');

insert into reserva (codigo, datareserva, leitor, obra) values 
(1, '2025-03-10', 1, 1),
(2, '2025-03-12', 2, 2),
(3, '2025-03-15', 3, 3);

insert into emprestimo (codigo, dataemprestimo, dataprevista, leitor, copia, funcionario, multa) values 
(1, '2025-03-10', '2025-04-01', 1, 1, 1, 40.00),
(2, '2025-03-12', '2025-04-05', 2, 2, 2, 55.00),
(3, '2025-03-15', '2025-04-10', 3, 3, 3, 30.00);

commit;


delete from funcionario where nome = 'Vitor Dahora';
delete from leitor where nome = 'Pedro Dantas';
delete from categorialeitor where codigo = 5;
delete from categoriaobra where codigo = 34;
delete from obra where titulo = 'Steins;Gate';
delete from copia where codigo = 2;
delete from reserva where codigo = 3;
delete from emprestimo where codigo = 3;

update categorialeitor set dias = dias + 3;
update emprestimo set multa = 0 where multa < 50;

select * from leitor
where categorialeitor = '1' and cidade = 'São Paulo'
order by email;

select * from funcionario
where cidade != 'São Paulo'
order by nome;

select titulo, autor
from obra
order by titulo;

select SUM(multa), COUNT(codigo)
from emprestimo;

select funcionario, COUNT(*) as total_emprestimos
from emprestimo 
group by funcionario;

select leitor, COUNT(*) as total_reservas 
from reserva
group by leitor;

select 
	l.nome, 
	o.titulo, 
	r.dataReserva
from reserva as r
inner join leitor as l
on r.codigo = l.codigo
inner join obra as o
on o.codigo = r.codigo;

select
	l.nome,
    o.titulo,
    e.copia,
    fu.nome
from emprestimo as e
inner join leitor as l
on e.codigo = l.codigo
inner join obra as o
on o.codigo = e.codigo
inner join funcionario as fu
on fu.codigo = e.codigo;

select
	l.nome
from leitor as l
left outer join reserva as r
on l.codigo = r.codigo
where r.leitor is null;

select
	l.nome
from leitor as l
left outer join emprestimo as e
on l.codigo = e.codigo
where e.leitor is null;

select
	o.titulo
from obra as o
left outer join copia as c
on o.codigo = c.codigoobra
left outer join emprestimo as e
on c.codigo = e.copia
where e.copia is null;


select
	nome,
    email 
from leitor
union
select
	nome,
    email
from funcionario
order by nome asc;

select
	nome,
    email 
from leitor
union all
select
	nome,
    email
from funcionario;

select 
	o.titulo,
    c.codigoObra
from copia as c
left join obra as o
on c.codigoOBra = o.codigo
where c.disponivel not in ('não');

select *
from copia
where disponivel in ('não');

select *
from leitor
where nome like '%silva%';

select *
from obra
where titulo like '%java%';

select *
from emprestimo
where dataEmprestimo between '2025-03-01' and '2025-03-30';

select *
from reserva
where dataReserva between '2025-03-01' and '2025-03-30';


create view vw_emprestimo as
	select
		l.nome,
        o.titulo
	from emprestimo as e
    left join leitor as l
    on l.codigo = e.leitor
    left join copia as c
    on c.codigo = e.copia
    inner join obra as o
    on o.codigo = c.codigoobra;
   
create unique index ix_titulo on obra (titulo);
create unique index ix_documento on leitor (documento);
create unique index ix_nome on funcionario (nome);


create table auditlog (
	codigo bigint primary key auto_increment, 
    nomeTabela varchar(100),
    registroRemovido varchar(100),
    data date
);

delimiter $$
create trigger trg_reserva after delete on reserva
	for each row
begin
	insert into auditlog(nomeTabela, registroRemovido, data)
	values ('reserva', concat_ws( '|', old.codigo, old.datareserva, old.dataretirada,
    old.dataprevista, old.leitor, old.obra), now());
end $$
delimiter ;

delimiter $$
create trigger trg_emprestimo after delete on emprestimo
	for each row
begin
	insert into auditlog(nomeTabela, registroRemovido, data)
    values ('emprestimo', concat_ws('|', old.dataemprestimo, old.dataprevista, old.datadevolucao, old.multa,
	old.leitor, old.copia, old.funcionario), now());
end $$
delimiter ;

select * from funcionario;
delete from funcionario where nome = 'Miguel Silva';
select * from leitor;
delete from leitor where nome = 'Lucas Marques';

