-- crear tabla videojuegos
create table videojuegos(
	codigo int not null,
	nombre varchar(100) not null,
	descripcion varchar(300),
	valoracion int,
	constraint codigo_pk primary key(codigo)
)
insert into videojuegos(codigo,nombre,descripcion,valoracion)
values(1,'God Of War:Rangarok','Juego de kratos',7)
insert into videojuegos(codigo,nombre,descripcion,valoracion)
values(2,'Downhill Domination','Juego de carreras en bicicleta',9)
insert into videojuegos(codigo,nombre,descripcion,valoracion)
values(3,'Crash Bandicoot','Juego de parkour de un zorrito',9)
insert into videojuegos(codigo,nombre,descripcion,valoracion)
values(4,'Mario Bros','Juego del fontanero Mario para salvar a la Princesa',8)
insert into videojuegos(codigo,nombre,descripcion,valoracion)
values(5,'Hollow Knight','Juego tipo metroidvania',10)
insert into videojuegos(codigo,nombre)
values(6,'Hollow Knight: Silksong')
insert into videojuegos(codigo,nombre)
values(7,'Resident Evil 4')
insert into videojuegos(codigo,nombre)
values(8,'Minecraft')
select * from videojuegos