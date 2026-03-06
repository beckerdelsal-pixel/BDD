drop table clientes
create table clientes(
	cedula char(10) not null,
	nombre varchar (10) not null,
	numeroHijos int not null,
	constraint clientes_pk primary key (cedula)
)
select * from clientes

delete from clientes where nombre = 'Carla'