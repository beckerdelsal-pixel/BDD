--crear tabla transacciones
create table transacciones(
	codigo int not null,
	numero_cuenta char(5) not null,
	monto money not null,
	tipo char(1) not null,
	fecha date not null,
	hora time not null,
	constraint codigoTransacciones_pk primary key(codigo)
)
insert into transacciones(codigo,numero_cuenta,monto,tipo,fecha,hora)
values(001,'01234',500.00,'D','03/06/2024','07:00')
insert into transacciones(codigo,numero_cuenta,monto,tipo,fecha,hora)
values(002,'56789',800.00,'C','04/06/2024','07:00')
insert into transacciones(codigo,numero_cuenta,monto,tipo,fecha,hora)
values(003,'98765',200.00,'D','04/06/2024','10:00')
insert into transacciones(codigo,numero_cuenta,monto,tipo,fecha,hora)
values(004,'59982',1500.00,'C','04/06/2024','17:00')
insert into transacciones(codigo,numero_cuenta,monto,tipo,fecha,hora)
values(005,'12237',1500.00,'D','10/06/2024','07:00')
insert into transacciones(codigo,numero_cuenta,monto,tipo,fecha,hora)
values(006,'00875',1502.00,'D','25/06/2024','08:30')
insert into transacciones(codigo,numero_cuenta,monto,tipo,fecha,hora)
values(007,'22486',1700.00,'C','09/10/2024','15:00')
insert into transacciones(codigo,numero_cuenta,monto,tipo,fecha,hora)
values(008,'26697',1500.00,'C','10/11/2024','07:00')
insert into transacciones(codigo,numero_cuenta,monto,tipo,fecha,hora)
values(009,'11652',2500.00,'C','25/12/2024','11:00')
insert into transacciones(codigo,numero_cuenta,monto,tipo,fecha,hora)
values(010,'43210',1500.00,'D','29/08/2025','07:00')
insert into transacciones(codigo,numero_cuenta,monto,tipo,fecha,hora)
values(011,'43610',100.00,'D','29/08/2025','07:00')
select * from transacciones