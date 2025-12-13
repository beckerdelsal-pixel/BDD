
SELECT
    p.cedula,
    p.nombre,
    p.apellido,
   
    SUM(pr.monto::numeric)::money AS monto_total_prestamos
FROM
    persona p
JOIN
    prestamo pr ON p.cedula = pr.cedula 
GROUP BY
    p.cedula, p.nombre, p.apellido 
ORDER BY
    monto_total_prestamos DESC;

SELECT
    COUNT(*) AS personas_con_mas_de_un_hijo
FROM
    persona
WHERE
    numero_hijos > 1;