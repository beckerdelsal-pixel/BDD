
select per.cantidad_ahorrada, prest.monto, prest.garante from 
persona per,  prestamo prest

where 
prest.monto::numeric between 100.00 and 1000.00

select per.cedula, per.nombre, per.apellido, per.cantidad_ahorrada from
persona per

where 
cedula = (select cedula from persona where nombre = 'Sean')