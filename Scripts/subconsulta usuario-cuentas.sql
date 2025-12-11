
select ct.numero_cuenta,ct.fecha_creacion, ct.saldo, us.cedula
 
FROM
    cuentas ct 
JOIN
   usuario us ON ct.cedula_propietario = us.cedula
where 
ct.fecha_creacion between '2022/09/21' and '2023/09/21';