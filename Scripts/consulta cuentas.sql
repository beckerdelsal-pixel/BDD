select numero_cuenta, saldo from cuentas
select * from cuentas
select * from cuentas where fecha_creacion between (current_date - interval '2 months') and current_date
select numero_cuenta,saldo from cuentas where fecha_creacion between (current_date - interval '2 months') and current_date