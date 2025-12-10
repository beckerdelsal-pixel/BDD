create table compras(
	id_compra int ,
	cedula char(10) not null,
	fecha_compra date not null,
	monto decimal(10,2) not null,

	constraint compras_pk primary key (id_compra)
)

alter table compras
add constraint cliente_compras_fk
foreign key (cedula)
references clientes (cedula)

insert into compras (id_compra, cedula, fecha_compra, monto)
values (1, '1701234567', '2025-11-20', 55.50),
(2, '0712345678', '2025-11-21', 120.00),
(3, '0987654327', '2025-11-22', 15.99),
(4, '1799001127', '2025-11-23', 35.75),
(5, '0607070707', '2025-11-24', 200.00),
(6, '1357908642', '2025-11-25', 18.30),
(7, '0102030470', '2025-11-26', 99.40),
(8, '1122773344', '2025-11-27', 75.60),
(9, '0505050570', '2025-11-28', 145.10),
(10, '1070707070', '2025-11-29', 10.00);

select * from compras