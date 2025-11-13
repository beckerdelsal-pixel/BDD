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
values('01234','25689','2025/10/29',500.00)
insert into cuentas(numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values('56789','25688','2025/10/22',800.00)
insert into cuentas(numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values('98765','25687','2024/10/29',200.00)
insert into cuentas(numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values('59982','25686','1990/10/22',1500.00)
insert into cuentas(numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values('12237','25685','1989/10/10',1500.00)
insert into cuentas(numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values('00875','25684','1949/10/13',1502.00)
insert into cuentas(numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values('22486','25683','1959/10/28',1700.00)
insert into cuentas(numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values('26697','25682','1969/12/14',1500.00)
insert into cuentas(numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values('11652','25681','2025/10/26',2500.00)
insert into cuentas(numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values('43210','25680','2005/06/19',1500.00)
select * from cuentas