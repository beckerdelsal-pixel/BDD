drop table prestamo
create table prestamo(
	cedula char(10),
	monto money,
	fecha_prestamo date,
	hora_prestamo time,
	garante varchar(40)

)

alter table prestamo
add constraint persona_prestamo_fk
foreign key (cedula)
references persona(cedula)

insert into prestamo(cedula, monto, fecha_prestamo, hora_prestamo, garante)
values ('1111111111', 500.00, '2025-01-10', '10:00:00', 'Juan Lopez'),
('2222222222', 125.50, '2025-01-11', '11:30:00', 'Maria Diaz'),
('3333333333', 999.99, '2025-01-12', '13:00:00', 'Pedro Solis'),
('1111111111', 450.75, '2025-01-13', '14:30:00', 'Ana Perez'),
('2222222222', 780.00, '2025-01-14', '09:00:00', 'Luis Garcia'),
('3333333333', 210.30, '2025-01-15', '10:30:00', 'Sofia Ramos'),
('1111111111', 620.40, '2025-01-16', '12:00:00', 'Roberto Velez'),
('2222222222', 350.60, '2025-01-17', '13:30:00', 'Elena Castro'),
('3333333333', 890.10, '2025-01-18', '08:00:00', 'Fernando Ruiz'),
('1111111111', 100.00, '2025-01-19', '11:00:00', 'Diana Mora');

select * from prestamo