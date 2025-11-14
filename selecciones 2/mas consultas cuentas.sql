select * from cuentas

select numero_cuenta,saldo from cuentas where (saldo > 100::money) and (saldo < 1000::money)

select * from cuentas where fecha_creacion between (current_date-interval '1 years') and current_date

select * from cuentas where (saldo = 0.00::money) or (cedula_propietario like '%2')