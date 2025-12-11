SELECT
    id_plataforma,
    nombre_plataforma,
    codigo_videojuego
FROM
    plataformas
WHERE
    codigo_videojuego = (
        SELECT
            codigo
        FROM
            videojuegos
        WHERE
            nombre = 'God of war'
    );


SELECT
    v.nombre,
    v.descripcion,
    v.valoracion,
    p.nombre_plataforma
FROM
    videojuegos v
JOIN
    plataformas p ON v.codigo = p.codigo_videojuego
WHERE
    (
        v.descripcion LIKE '%Guerra%'
        AND v.valoracion > 7
    )
    OR (
        v.nombre LIKE 'C%'
        AND v.valoracion > 8
    )
    OR (
        v.nombre LIKE 'D%'
        AND v.valoracion > 8
    );