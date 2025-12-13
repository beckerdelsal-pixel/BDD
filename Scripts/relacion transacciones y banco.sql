
SELECT
    COUNT(*) AS total_transacciones_credito
FROM
    transacciones
WHERE
    tipo = 'C';


SELECT
    numero_cuenta,
    ROUND(
        AVG(
            monto::decimal
        ),
		2
    ) AS monto_promedio
FROM
    transacciones
GROUP BY
    numero_cuenta
ORDER BY
    numero_cuenta;