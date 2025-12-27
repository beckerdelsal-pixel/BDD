
create table prestamos(
	id_prestamo serial not null,
	libro_id serial not null,
	usuario varchar(25),
	fecha_prestamo date not null,
	fecha_devolucion date not null,

	constraint prestamos_pk primary key (id_prestamo)
)

alter table prestamos
add constraint libro_id_fk
foreign key (libro_id)
references libros(id_libro)
select * from prestamos
insert into prestamos(id_prestamo,libro_id,usuario,fecha_prestamo,fecha_devolucion)
values(1,03,'Jose','1995-05-23','2000-05-23'),
(2,04,'Jose','2000-02-23','2001-02-23'),
(3,02,'Jose','1995-12-23','2002-05-25'),
(4,05,'Jose','1995-08-23','2009-05-23'),
(5,02,'Jose','2000-03-23','2003-05-23'),
(6,10,'Jose','2003-09-23','2005-05-23'),
(7,08,'Jose','2003-11-23','2005-05-23'),
(8,01,'Jose','2003-04-23','2005-05-23'),
(9,07,'Jose','2005-02-23','2007-05-23'),
(10,09,'Jose','2014-01-23','2015-05-23')