--trae nombre y cedula de los estudiantes
select nombre,cedula from estudiantes
--nombre de los estudiantes cuya cedula empiece con 17
select nombre from estudiantes where cedula like '17%'
--nombre completo de los estudiantes cuyo nombre empiece con A
select nombre,apellido from estudiantes where nombre like 'A%'
select * from estudiantes
--actualizar apellido por hernandez
update estudiantes set apellido = 'Hernandez' where cedula like '17%'

delete from estudiantes where cedula like '%05'