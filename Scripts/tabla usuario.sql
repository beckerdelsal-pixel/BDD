
create table usuario(
	cedula char(10),
	nombre varchar(25) not null,
	apellido varchar(25) not null,
	tipo_cuenta varchar(20),
	limite_credito decimal(10,2),

	constraint usuario_pk primary key (cedula)
)

select * from usuario

insert into usuario (cedula, nombre, apellido, tipo_cuenta, limite_credito)
values ('12345', 'Carlos', 'Perez', 'Ahorros', 5000.00),
('67890', 'Ana', 'Lopez', 'Corriente', 10000.00),
('11111', 'Luis', 'Gomez', 'Inversion', 25000.00),
('22222', 'Maria', 'Diaz', 'Ahorros', 3000.00);