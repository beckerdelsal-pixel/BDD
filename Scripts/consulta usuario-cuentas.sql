
select ct.numero_cuenta,us.nombre, ct.saldo
 
FROM
    cuentas ct 
JOIN
   usuario us ON ct.cedula_propietario = us.cedula
where 
ct.saldo::numeric between 100.00 and 1000.00;