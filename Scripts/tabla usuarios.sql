
create table usuarios(
	id_usuario int not null,
	nombre varchar(50) not null,
	apellido varchar(50) not null,
	fecha_nacimiento date not null,

	constraint usuarios_pk primary key (id_usuario)
)

select * from usuarios