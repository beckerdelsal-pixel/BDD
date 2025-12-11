
select est.codigo_profesor, est.nombre, est.apellido from
profesores prof, estudiantes est

where 
est.nombre like '%n'

select est.nombre, est.apellido, prof.codigo from 
profesores prof, estudiantes est
where 
prof.nombre_profesor = 'Francisco'