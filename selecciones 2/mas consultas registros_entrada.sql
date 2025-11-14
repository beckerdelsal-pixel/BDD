select * from registros_entrada

select * from registros_entrada where (to_char(fecha,'MM') = '09') or (cedula_empleado like '17%')

select * from registros_entrada where (to_char(fecha,'MM') = '08') and (cedula_empleado like '17%') and (hora between '8:00:00' and '12:00:00')

select * from registros_entrada where ((to_char(fecha,'MM') = '08') and (cedula_empleado like '17%') and (hora between '8:00:00' and '12:00:00')) or ((to_char(fecha,'MM')='09') and (cedula_empleado like '08%') and (hora between '09:00:00' and '13:00:00'))
