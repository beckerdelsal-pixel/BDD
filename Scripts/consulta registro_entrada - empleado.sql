SELECT
    re.cedula_empleado,
    re.fecha,
    e.nombre
FROM
    registros_entrada re
JOIN
    empleado e ON re.codigo_empleado = e.codigo_empleado
WHERE
    -- Condición 1
    (re.fecha BETWEEN '2023-08-01' AND '2023-08-31')

    OR
    -- Condición 2
    (re.cedula_empleado LIKE '%17%' AND re.hora BETWEEN '08:00:00' AND '12:00:00')
    
    OR
    -- Condición 3
    (
        -- Parte 1
        (re.fecha BETWEEN '2023-10-06' AND '2023-10-20')
        -- Parte 2
        AND (re.cedula_empleado LIKE '%08%' AND re.hora BETWEEN '09:00:00' AND '13:00:00')
    );


SELECT *
FROM
    empleado e
WHERE
    e.codigo_empleado IN (
        SELECT
            codigo_empleado
        FROM
            registros_entrada
        WHERE
            codigo_empleado = '2201'
    );