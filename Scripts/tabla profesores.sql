drop table profesores
create table profesores(
	codigo int,
	nombre_profesor varchar(50) not null,

	constraint profesores_pk primary key (codigo)
)
insert into profesores (codigo, nombre_profesor) 
values (101, 'Francisco'), 
(102, 'Adriana'),
(103, 'Roberto');

select * from profesores