-- crear tabla registros entrada
create table registros_entrada(
	codigo_registro int not null,
	cedula_empleado char(10) not null,
	fecha date not null,
	hora time not null,
	constraint codigo_registro_pk primary key(codigo_registro)
)
insert into registros_entrada(codigo_registro,cedula_empleado,fecha,hora)
values(001,'0998544636','03/06/2024','07:00')
insert into registros_entrada(codigo_registro,cedula_empleado,fecha,hora)
values(002,'1234556453','03/06/2024','07:00')
insert into registros_entrada(codigo_registro,cedula_empleado,fecha,hora)
values(003,'0941088304','03/06/2024','07:00')
insert into registros_entrada(codigo_registro,cedula_empleado,fecha,hora)
values(004,'0927586990','03/06/2024','07:00')
insert into registros_entrada(codigo_registro,cedula_empleado,fecha,hora)
values(005,'0984662390','03/06/2024','07:00')
insert into registros_entrada(codigo_registro,cedula_empleado,fecha,hora)
values(006,'0922144266','04/06/2024','10:00')
insert into registros_entrada(codigo_registro,cedula_empleado,fecha,hora)
values(007,'0887996547','04/06/2024','10:00')
insert into registros_entrada(codigo_registro,cedula_empleado,fecha,hora)
values(008,'0978663218','04/06/2024','10:00')
insert into registros_entrada(codigo_registro,cedula_empleado,fecha,hora)
values(009,'1785223569','04/06/2024','10:00')
insert into registros_entrada(codigo_registro,cedula_empleado,fecha,hora)
values(010,'1744591234','04/06/2024','10:00')
select * from registros_entrada