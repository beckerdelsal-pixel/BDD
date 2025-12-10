
create table ventas(
	id_venta int,
	codigo_producto int not null,
	fecha_venta date not null,
	cantidad int,

	constraint ventas_pk primary key (codigo_producto)
)

alter table ventas
add constraint producto_codigo_fk
foreign key (codigo_producto)
references productos(codigo)

insert into ventas (id_venta, codigo_producto, fecha_venta, cantidad)
values (1, 1, '2025-12-01', 2),
(2, 9, '2025-12-01', 1),
(3, 10, '2025-12-02', 10),
(4, 2, '2025-12-02', 3),
(5, 5, '2025-12-03', 5),
(6, 3, '2025-12-03', 1),
(7, 7, '2025-12-04', 2),
(8, 8, '2025-12-04', 4),
(9, 6, '2025-12-05', 12),
(10, 4, '2025-12-05', 1);

select * from ventas