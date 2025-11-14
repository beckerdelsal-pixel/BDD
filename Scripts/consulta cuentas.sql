select numero_cuenta, saldo from cuentas
select * from cuentas
select * from cuentas where fecha_creacion between (current_date - interval '2 months') and current_date
select numero_cuenta,saldo from cuentas where fecha_creacion between (current_date - interval '2 months') and current_date
update cuentas set saldo = 10 where cedula_propietario like '17%'

update cuentas set cedula_propietario = '17197' where numero_cuenta ='98765'