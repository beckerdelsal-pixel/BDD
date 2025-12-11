-- crear tabla registros entrada
drop table registros_entrada
create table registros_entrada(
	codigo_registro int not null,
	cedula_empleado char(10) not null,
	fecha date not null,
	hora time not null,
	constraint codigo_registro_pk primary key(codigo_registro)
)
delete from registros_entrada
drop table registros_entrada
insert into registros_entrada(codigo_registro, cedula_empleado, fecha, hora, codigo_empleado)
values(1, '0987654321', '2023-08-15', '08:00:00',' 2201'),
(2, '0987654321', '2023-09-01', '09:30:00', '2201'), 
(3, '0123456789', '2023-10-20', '10:45:00', 1001), 
(4, '0234567890', '2023-11-05', '11:15:00', 3003), 
(5, '0987654321', '2023-12-10', '12:00:00', '2201'), 
(6, '0123456789', '2023-08-25', '12:59:00', 1001), 
(7, '0234567890', '2023-09-15', '08:30:00', 3003), 
(8, '0987654321', '2023-10-01', '09:05:00', '2201'), 
(9, '0123456789', '2023-11-28', '11:00:00', 1001), 
(10, '0234567890', '2023-12-31', '10:15:00', 3003); 

select * from registros_entrada