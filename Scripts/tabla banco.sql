drop table banco
create table banco(
	codigo_banco int,
	codigo_transaccion int,
	detalle varchar(100),

	constraint banco_pk primary key (codigo_banco,codigo_transaccion)
)

alter table banco
add constraint transaccion_banco_fk
foreign key (codigo_transaccion)
references transacciones(codigo)

insert into banco(codigo_banco, codigo_transaccion, detalle)
values (10, 1, 'Retiro en ATM'),
(10, 2, 'Depósito en Ventanilla'),
(11, 3, 'Transferencia recibida'),
(12, 4, 'Pago de servicio'),
(13, 5, 'Compra en línea');

select * from banco