--cedula, fecha y hora
select cedula_empleado,fecha,hora from registros_entrada
--registros entre 7:00 y 14:00
select * from registros_entrada where hora between '7:00:00'::time and '14:00:00'::time
--registros de entrada mayores a 8:00:00
select * from registros_entrada where hora > '8:00:00'::time