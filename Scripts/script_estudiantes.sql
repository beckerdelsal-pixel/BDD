-- crear tabla estudiantes
create table estudiantes(
	cedula char(10) not null,
	nombre varchar(50) not null,
	apellido varchar(50) not null,
	email varchar(50) not null,
	fecha_nacimiento date not null,
	constraint estudiantes_pk primary key(cedula)
)
insert into estudiantes(cedula,nombre,apellido,email,fecha_nacimiento)
values('0998544636','Juanito','Alimaña','juanitoalim@hotmail.com','10/05/2002')
insert into estudiantes(cedula,nombre,apellido,email,fecha_nacimiento)
values('1234556453','Pedro','Alchundia','pedroalchundia79@gmail.com','14/10/1979')
insert into estudiantes(cedula,nombre,apellido,email,fecha_nacimiento)
values('0941088304','Becker','Del Salto','beckerdelsalto@gmail.com','29/06/2005')
insert into estudiantes(cedula,nombre,apellido,email,fecha_nacimiento)
values('0927586990','Carla','Gallardo','carlagallardoz101105@gmail.com','10/11/2005')
insert into estudiantes(cedula,nombre,apellido,email,fecha_nacimiento)
values('0984662390','Domenica','Leon','dominicaleon11@gmail.com','13/07/2011')
insert into estudiantes(cedula,nombre,apellido,email,fecha_nacimiento)
values('0922144266','Leidy','Leon','rosseleon18@hotmail.com','18/09/1979')
insert into estudiantes(cedula,nombre,apellido,email,fecha_nacimiento)
values('0887996547','Alan','Brito','alanbritodelgado24@yahoo.com','24/09/1999')
insert into estudiantes(cedula,nombre,apellido,email,fecha_nacimiento)
values('0978663218','Susana','Oria','susanaoriablanca@outlook.com','24/12/2015')
select * from estudiantes