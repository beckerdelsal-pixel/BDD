select * from productos where nombre like 'Q%'

select * from productos where descripcion is null

select * from productos where precio between 2::money and 3::money

update productos set stock = 0 where descripcion is null

delete from productos where descripcion is null