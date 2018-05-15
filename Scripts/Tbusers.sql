CREATE DATABASE firehookah;

use firehookah;

-- CRUD
-- Create -> create 
create table tbusuarios(
iduser int primary key not null auto_increment,
nomeuser VARCHAR (20) not null,
foneuser VARCHAR (15),
emailuser VARCHAR (30),
login VARCHAR (15) unique not null,
senha Varchar (15) not null
);

insert into tbusuarios (nomeuser, foneuser, emailuser, login, senha)
values ('Administrador', '96051-8717', 'admin@firehookah.com', 'admin', 'adminadmin');

describe tbusuarios;
-- Read -> select

SELECT * FROM tbusuarios;


-- update -> update

update tbusuarios set foneuser ='96051-8717' where iduser=2;


-- Delete -> delete

