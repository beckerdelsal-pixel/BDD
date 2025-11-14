select * from transacciones where (tipo = 'C') and (numero_cuenta between '22001' and '22004')

select * from transacciones where (tipo = 'D') and to_char(fecha, 'DD') = '25' and to_char(fecha,'MM')='25'
and (numero_cuenta between '22007' and '22010')

select * from transacciones where (codigo between 1 and 5) and (numero_cuenta='22002' or numero_cuenta='22004') and (to_char(fecha,'MM')='05' and (to_char(fecha,'DD')='26') or (to_char(fecha,'DD')='29'))