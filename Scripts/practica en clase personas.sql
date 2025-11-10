--crear tabla personas
create table personas(
	cedula char(10) not null,
	nombre varchar(50) not null,
	apellido varchar(50) not null,
	estatura decimal,
	fecha_nacimiento date,
	hora_nacimiento time,
	cantidad_ahorrada money,
	numero_hijos int,
	constraint personas_pk primary key (cedula)
)
insert into personas(cedula, nombre, apellido)
values('0985667850', 'Becker', 'Del Salto')
insert into personas(cedula, nombre, apellido, estatura)
values('0927586990', 'Carla', 'Gallardo', 1.85)
insert into personas(cedula, nombre, apellido, numero_hijos)
values('1754668934', 'Pedro', 'Navaja', 2)
insert into personas(cedula, nombre, apellido, numero_hijos, estatura, fecha_nacimiento, hora_nacimiento, cantidad_ahorrada)
values('1732268934', 'Pedro', 'Navaja', 1, 1.70,'22/05/2000','22:54',200.35)

select cedula,nombre,apellido,estatura from personas
select * from personas