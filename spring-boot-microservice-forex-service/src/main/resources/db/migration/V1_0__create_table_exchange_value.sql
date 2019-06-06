DROP TABLE IF EXISTS exchange_value CASCADE;

CREATE TABLE exchange_value
(
    id BIGSERIAL NOT NULL PRIMARY KEY,
    currency_from VARCHAR NOT NULL,
    currency_to VARCHAR NOT NULL,
    conversion_multiple NUMERIC NOT NULL,
    port INTEGER NOT NULL
)