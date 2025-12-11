create table clientes(
	cedula char(10),
	nombre varchar(50) not null,
	apellido varchar (50) not null,

	constraint clientes_pk primary key (cedula)
)
drop from clientes
insert into clientes (cedula, nombre, apellido)
values ('1701234567', 'Monica', 'Velez'), 
('0712345678', 'Andres', 'Guerra'), 
('0987654327', 'Sofia', 'Ramos'),   
('1799001127', 'Javier', 'Solis'),  
('0607070707', 'Diana', 'Molina'),  
('1357908642', 'Ricardo', 'Peña'),   
('0102030470', 'Elena', 'Troya'),   
('1122773344', 'Fernando', 'Ruiz'), 
('0505050570', 'Laura', 'Cajas'),    
('1070707070', 'Pedro', 'Mendez');   
select * from clientes