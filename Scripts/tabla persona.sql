
create table persona(
	cedula char(10)not null,
	nombre varchar(50) not null,
	apellido varchar(50) not null,
	estatura decimal(10,2),
	fecha_nacimiento date not null,
	hora_nacimiento time,
	cantidad_ahorrada money,
	numero_hijos int,

	constraint persona_pk primary key (cedula)
)

insert into persona(cedula, nombre, apellido, estatura,
			fecha_nacimiento, hora_nacimiento, cantidad_ahorrada, numero_hijos)
values ('1111111111', 'Sean', 'Connors', 1.85, '1980-05-15', '09:30:00', 5000.00, 2), -- Cumple el criterio "Sean"
('2222222222', 'Elisa', 'Vargas', 1.68, '1995-11-20', '14:00:00', 1200.50, 0),
('3333333333', 'Mario', 'Guzman', 1.75, '1970-01-01', '06:00:00', 800.00, 3);