--1
SELECT
    c.cedula,
    c.nombre,
    c.apellido,
    SUM(co.monto) AS monto_total_compras
FROM
    clientes c
JOIN
    compras co ON c.cedula = co.cedula
GROUP BY
    c.cedula, c.nombre, c.apellido 
ORDER BY
    monto_total_compras DESC;

--2
SELECT
    COUNT(*) AS total_compras_en_fecha
FROM
    compras
WHERE
    fecha_compra = '2023-10-15';