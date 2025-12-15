
create table grupo(
	id_grupo int not null,
	nombre varchar(50) not null,
	descripcion varchar(100) not null,
	fecha_creacion date not null,

	constraint grupo_pk primary key (id_grupo)
)

select * from grupo