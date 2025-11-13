--videouegos con nombres que empiecen con c
select * from videojuegos where nombre like 'C%'
--juegos con valoracion entre 9 y 10
select * from videojuegos where valoracion between 9 and 10
--videojuegos con descripcion null
select * from videojuegos where descripcion is null