
SELECT
    MAX(precio::numeric)::money AS precio_maximo
FROM
    productos;

SELECT
    SUM(cantidad) AS total_cantidad_vendida
FROM
    ventas;