select * from personas

update personas set estatura = 1.70 where cedula = '0985667850'

update personas set cantidad_ahorrada = 0.00 where cantidad_ahorrada is null

update personas set numero_hijos = 0 where numero_hijos is null

update personas set estatura=1.80, fecha_nacimiento='10/10/2000' where cedula ='1754668934'

delete from personas where estatura is null