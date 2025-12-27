
create table libros(
	id_libro serial not null,
	titulo varchar(75) not null,
	autor_id int not null,
	genero_id int not null,
	año_publicacion date not null,
	esta_disponible boolean not null,

	constraint libros_pk primary key (id_libro)
)
alter table libros
add constraint autor_id_fk
foreign key (autor_id)
references autores(id_autor)

alter table libros
add constraint genero_id_fk
foreign key (genero_id)
references genero(id_genero)
select * from libros
delete from libros
insert into libros(id_libro,titulo,autor_id,genero_id,año_publicacion,esta_disponible)
values(01, 'Las aventuras misteriosas',1,2,'2005-10-05','true'),
(02, 'Oceanos Atlanticos',1,2,'2005-10-05','false'),
(03, 'Mariposa Trepadora',2,2,'2005-10-05','true'),
(04, '1000 Cartas',1,5,'2005-10-05','true'),
(05, 'Tu y Yo',3,4,'2005-10-05','true'),
(06, 'Mas alla del sol',5,2,'2005-10-05','false'),
(07, 'El navegante',1,4,'2005-10-05','true'),
(08, 'Cobarde',2,3,'2005-10-05','true'),
(09, 'Huelo el Miedo',3,5,'2005-10-05','true'),
(10, 'Sombras en oscuridad',3,1,'2005-10-05','false')