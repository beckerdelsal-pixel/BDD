-- crear tabla cuentas
drop table cuentas
create table cuentas(
	numero_cuenta char(5) not null,
	cedula_propietario char(5) not null,
	fecha_creacion date not null,
	saldo money not null,
	constraint cuentas_pk primary key (numero_cuenta)
)
insert into cuentas(numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values('01234','25689','29/10/1989',500.00)
insert into cuentas(numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values('56789','25688','22/10/1999',800.00)
insert into cuentas(numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values('98765','25687','29/10/1997',200.00)
insert into cuentas(numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values('59982','25686','22/10/1990',1500.00)
insert into cuentas(numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values('12237','25685','10/10/1989',1500.00)
insert into cuentas(numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values('00875','25684','13/10/1949',1502.00)
insert into cuentas(numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values('22486','25683','28/10/1959',1700.00)
insert into cuentas(numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values('26697','25682','14/12/1969',1500.00)
insert into cuentas(numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values('11652','25681','26/11/2000',2500.00)
insert into cuentas(numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values('43210','25680','19/06/2005',1500.00)
select * from cuentas