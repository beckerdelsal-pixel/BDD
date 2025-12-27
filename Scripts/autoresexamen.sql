
create table autores(
	id_autor serial  ,
	nombre varchar(50) not null,
	fecha_nacimiento date not null,
	nacionalidad varchar(50) not null,

	constraint autores_pk primary key (id_autor)
	
)
select * from autores
drop table autores

insert into autores(id_autor, nombre, fecha_nacimiento, nacionalidad)
values(1, 'Edgar', '1995-10-05', 'Ecuatoriano'),
(2,'Roberto','1870/05/25','Argentino'),
(3,'Juan','2000/12/05','Uruguayo'),
(4,'Alberto','1970/08/29','Dominicano'),
(5,'Jose','1855/11/17','Salvadoreño')