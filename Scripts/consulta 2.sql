
select cli.nombre,cli.apellido from 
clientes cli, compras cp

where 
cli.cedula like '%7' and cp.cedula like '%7'

select 	cli.cedula,cli.nombre,cli.apellido from
clientes cli, compras cp
where 
cli.nombre = 'Monica'