SELECT
    codigo,
    numero_cuenta,
    monto,
    fecha
FROM
    transacciones
WHERE
    tipo = 'C'
    AND numero_cuenta BETWEEN '22001' AND '22004';

SELECT
    codigo,
    numero_cuenta,
    monto,
    tipo,
    fecha,
    hora
FROM
    transacciones
WHERE
    codigo IN (
        
        SELECT
            codigo_transaccion
        FROM
            banco
        WHERE
            codigo_banco = 1
    );