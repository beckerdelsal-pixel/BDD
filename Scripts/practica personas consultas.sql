
select pe.cedula, pe.nombre,pe.apellido,ec.descripcion from
personas pe,estado_civil ec
where 
pe.estado_civil_codigo = ec.codigo
and nombre like 'B%'