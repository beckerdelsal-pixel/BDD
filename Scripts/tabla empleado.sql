alter table registros_entrada
add column codigo_empleado int not null
drop table empleado
create table empleado(
	codigo_empleado int not null,
	nombre varchar(25) not null,
	fecha date not null,
	hora time not null,
	constraint empleado_pk primary key (codigo_empleado)
)

select * from empleado
insert into empleado(codigo_empleado, nombre, fecha, hora)
values (2201, 'Ricardo Lopez', '2023-01-10', '09:00:00'), 
(1001, 'Ana Garcia', '2022-05-15', '08:30:00'),
(3003, 'Carlos Velez', '2024-02-20', '10:00:00');

alter table registros_entrada
add constraint registros_empleado_fk
foreign key (codigo_empleado)
references empleado(codigo_empleado)