--transacciones de tipo D
select * from transacciones where tipo = 'D'
--montos entre 200 y 2000
select * from transacciones where monto between 200::money and 2000::money
--fecha diferente de null
select codigo,monto,tipo,fecha from transacciones where fecha is not null