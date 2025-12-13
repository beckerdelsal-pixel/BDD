
SELECT
    v.nombre AS nombre_videojuego,
    COUNT(p.id_plataforma) AS total_plataformas
FROM
    videojuegos v
JOIN
    plataformas p ON v.codigo = p.codigo_videojuego
GROUP BY
    v.nombre, v.codigo 
ORDER BY
    total_plataformas DESC;


SELECT
    ROUND(
        AVG(valoracion),
        2
    ) AS valoracion_promedio
FROM
    videojuegos;