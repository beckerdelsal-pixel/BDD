SELECT
    p.nombre_profesor,
    COUNT(e.cedula) AS total_estudiantes_asignados
FROM
    estudiantes e
JOIN
    profesores p ON e.codigo_profesor = p.codigo
GROUP BY
    p.nombre_profesor
ORDER BY
    total_estudiantes_asignados DESC;


SELECT
    ROUND(
        AVG(
            EXTRACT(YEAR FROM CURRENT_DATE) - EXTRACT(YEAR FROM fecha_nacimiento)
        )
    ) AS edad_promedio_entera
FROM
    estudiantes;