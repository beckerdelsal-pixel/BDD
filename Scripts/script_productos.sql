-- crear tabla productos
drop table productos
create table productos(
	codigo int not null,
	nombre varchar(50) not null,
	descripcion varchar(200),
	precio money not null,
	stock int not null,
	constraint productos_pk primary key(codigo)
)
insert into productos(codigo,nombre,descripcion,precio,stock)
values(1,'Arroz','Arroz que se vende por libra',1.50,500)
insert into productos(codigo,nombre,descripcion,precio,stock)
values(2,'Atun','Pescado enlatado',1.30,50)
insert into productos(codigo,nombre,descripcion,precio,stock)
values(3,'lentejas','Granos que se venden por libra',1.00,500)
insert into productos(codigo,nombre,descripcion,precio,stock)
values(4,'Camisetas','Camisetas con logos de bandas de rock',12.00,1000)
insert into productos(codigo,nombre,descripcion,precio,stock)
values(5,'Pulseras','Pulseras accesorios de cuero',5.00,100)
insert into productos(codigo,nombre,precio,stock)
values(6,'Libros',7.50,500)
insert into productos(codigo,nombre,precio,stock)
values(7,'Resident Evil 4',14.58,350)
insert into productos(codigo,nombre,precio,stock)
values(8,'Play Station 5',350.00,300)
insert into productos(codigo,nombre,precio,stock)
values(9,'Quinoa',1.50,500)
insert into productos(codigo,nombre,precio,stock)
values(10,'Queso',2.75,50)
insert into productos(codigo,nombre,precio,stock)
values(11,'Quita-Esmalte',1.00,12)
insert into productos(codigo,nombre,precio,stock)
values(12,'Quesadilla',0.55,50)


select * from productos