PROYECTO EN CLASES

BASE DE DATOS

create database nueva;
use nueva;
create table poeta(
idPoeta int auto_increment,
nombre varchar(45),
aPaterno varchar(45),
aMaterno varchar(45),
email varchar(45),
pseudonimo varchar(45),
sexo varchar(45),
nacionalidad varchar(45),
primary key(idPoeta)
);
create table poema(
idPoema int auto_increment,
idPoeta int,
titulo varchar(45),
tipo varchar(45),
fecha date,
nacionalidad varchar(45),
primary key(idPoema),
foreign key(idPoeta) references poeta(idPoeta)
);