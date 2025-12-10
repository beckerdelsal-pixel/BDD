create table plataformas(
	id_plataforma int,
	nombre_plataforma varchar(50) not null,
	codigo_videojuego int,

	constraint plataformas_pk primary key (id_plataforma)
)

alter table plataformas
add constraint videojuegos_codigo_fk
foreign key (codigo_videojuego)
references videojuegos(codigo)

insert into plataformas(id_plataforma, nombre_plataforma, codigo_videojuego)
values (101, 'PlayStation 4', 1),
(102, 'PlayStation 5', 1),
(201, 'PC', 2),
(202, 'Xbox Series X', 2),
(301, 'PC', 3),
(401, 'Nintendo Switch', 10),
(501, 'PlayStation 4', 4),
(601, 'Xbox One', 5),
(701, 'PC', 6),
(801, 'PlayStation 5', 8);

select * from plataformas