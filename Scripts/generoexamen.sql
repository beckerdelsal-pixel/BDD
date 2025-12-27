
create table genero(
	id_genero serial not null,
	nombre varchar(75) not null,

	constraint genero_pk primary key (id_genero)
)
select * from genero
insert into genero(id_genero, nombre)
values(1, 'terror'),
(2, 'suspenso'),
(3, 'accion'),
(4, 'fantasia'),
(5, 'futurismo')

