
create table Imoveis(
codigo           int primary key,
nomeProprietario varchar(80) not null,
valor            money not null,
cep              char(8) not null,
numero           smallint not null,
complemento      varchar(80) null
)

drop table Imoveis

insert into Imoveis values(1,'Fabio', 537700000, '13012100', 32000, null)

select * from Imoveis 
