
SELECT
    e.codigo_empleado,
    e.nombre AS nombre_empleado,
    COUNT(re.codigo_empleado) AS total_registros_entrada
FROM
    empleado e
JOIN
    registros_entrada re ON e.codigo_empleado = re.codigo_empleado
GROUP BY
    e.codigo_empleado, e.nombre
ORDER BY
    total_registros_entrada DESC;



SELECT
    MIN(fecha) AS fecha_minima_entrada,
    MAX(fecha) AS fecha_maxima_entrada
FROM
    registros_entrada;



