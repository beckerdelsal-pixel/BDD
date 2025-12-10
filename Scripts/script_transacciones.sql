--crear tabla transacciones
drop table transacciones
create table transacciones(
	codigo int not null,
	numero_cuenta char(5) not null,
	monto money not null,
	tipo char(1) not null,
	fecha date not null,
	hora time not null,
	constraint codigoTransacciones_pk primary key(codigo)
)
delete from transacciones
insert into transacciones(codigo, numero_cuenta, monto, tipo, fecha, hora)
values(1, '22001', 50.00, 'D', '2025-12-01', '10:00:00'), 
(2, '22002', 120.50, 'C', '2025-12-01', '11:00:00'), 
(3, '22003', 25.00, 'C', '2025-12-02', '12:00:00'), 
(4, '22004', 300.00, 'C', '2025-12-02', '13:00:00'), 
(5, '22005', 80.00, 'D', '2025-12-03', '14:00:00'),
(6, '22001', 15.00, 'D', '2025-12-03', '15:00:00'),
(7, '22006', 45.00, 'C', '2025-12-04', '09:00:00'),
(8, '22007', 90.00, 'D', '2025-12-04', '10:00:00'),
(9, '22008', 11.50, 'C', '2025-12-05', '11:00:00'),
(10, '22009', 55.00, 'D', '2025-12-05', '12:00:00');


select * from transacciones