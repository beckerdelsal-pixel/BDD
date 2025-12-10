
create table cuentas(
	numero_cuenta char(5),
	cedula_propietario char(5) not null,
	fecha_creacion date not null,
	saldo money not null,

	constraint cuentas_pk primary key (numero_cuenta)
)

alter table cuentas
add constraint cedula_propietario_fk
foreign key (cedula_propietario)
references usuario(cedula)

select * from cuentas
insert into cuentas(numero_cuenta, cedula_propietario, fecha, saldo)
values ('C0001', '12345', '2022-10-15', 550.00),
('C0002', '67890', '2023-01-20', 125.50),
('C0003', '11111', '2022-12-01', 999.99),
('C0004', '22222', '2023-08-10', 450.75),
('C0005', '12345', '2023-03-05', 780.00),
('C0006', '67890', '2022-09-28', 210.30),
('C0007', '11111', '2023-06-12', 620.40),
('C0008', '22222', '2023-04-18', 350.60),
('C0009', '12345', '2022-11-25', 890.10),
('C0010', '67890', '2023-07-01', 100.00);

