--transacciones de tipo D
select * from transacciones where tipo = 'D'
--montos entre 200 y 2000
select * from transacciones where monto between 200::money and 2000::money
--fecha diferente de null
select codigo,monto,tipo,fecha from transacciones where fecha is not null
update transacciones set fecha ='25/08/2025', hora = '15:50:00' where monto = 1500::money
--transaccion mayor a 100 y menor a 500, en septiembre entre las 14 y las 20, cambiar tipo a T
update transacciones set tipo = 'T' where monto between 100::money and 500::money and to_char(fecha,'MM') = '09' and hora between '14:00:00' and '20:00:00'

delete from transacciones where hora between '14:00:00' and '18:00:00' and to_char(fecha,'MM')='08' and to_char(fecha,'YYYY')='2025'