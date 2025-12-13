SELECT
   
    AVG(saldo::numeric)::money AS saldo_promedio_usuario
FROM
    cuentas
WHERE
  
    cedula_propietario = '12345';


SELECT
    u.tipo_cuenta,
    COUNT(c.numero_cuenta) AS total_cuentas
FROM
    cuentas c
JOIN
    usuario u ON c.cedula_propietario = u.cedula
GROUP BY
    u.tipo_cuenta;
