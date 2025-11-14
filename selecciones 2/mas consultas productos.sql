select * from productos
select * from productos where stock = 10 and precio < 10.00::money

select nombre,stock,descripcion from productos where (nombre like '%m') or (nombre like 'M%') or (descripcion like '% %')

select nombre from productos where (descripcion is null) or (stock = 0)