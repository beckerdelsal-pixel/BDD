-- crear tabla estudiantes
drop table estudiantes
create table estudiantes(
	cedula char(10) not null,
	nombre varchar(50) not null,
	apellido varchar(50) not null,
	email varchar(50) not null,
	fecha_nacimiento date not null,
	codigo_profesor int,
	constraint estudiantes_pk primary key(cedula)
)

alter table estudiantes
add constraint codigo_profesor_fk
foreign key (codigo_profesor)
references profesores(codigo)
insert into estudiantes(cedula, nombre, apellido, email, fecha_nacimiento, codigo_profesor)
values ('0912345678', 'Daniela', 'Fernandez', 'daniela@mail.com', '2005-08-15', 101),
('0876543210', 'Alejandro', 'Sanchez', 'ale@mail.com', '2006-03-20', 102),
('0700112233', 'Veronica', 'Martin', 'vero@mail.com', '2005-11-10', 101), 
('0654321098', 'Javier', 'Pineda', 'javi@mail.com', '2006-01-05', 103),
('0543210987', 'Carmen', 'Herrera', 'carmen@mail.com', '2005-05-25', 102),
('0432109876', 'Emilio', 'Moncayo', 'emilio@mail.com', '2006-07-01', 103), 
('0321098765', 'Luisa', 'Quintana', 'luisa@mail.com', '2005-12-12', 101),
('0210987654', 'Manuel', 'Ortega', 'manuel@mail.com', '2006-02-18', 102),
('0109876543', 'Sofia', 'Torres', 'sofia@mail.com', '2005-09-30', 103),
('0098765432', 'Andres', 'Guzman', 'andres@mail.com', '2006-04-04', 101);

select * from estudiantes