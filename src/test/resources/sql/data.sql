DROP TABLE IF EXISTS prices;

CREATE TABLE prices(
    id BIGINT,
    brand_id BIGINT,
   start_date TIMESTAMP,
   end_date TIMESTAMP,
   price_list BIGINT PRIMARY KEY,
   product_id BIGINT,
   priority BIGINT,
   price DECIMAL(10,2) ,
   curr VARCHAR(255)
                   );

INSERT INTO prices(id, brand_id,start_date,end_date, price_list, product_id, priority, price, curr)
VALUES  (1, 1, TIMESTAMP '2020-06-14 00:00:00', TIMESTAMP '2020-12-31 23:59:59', 1, 35455, 0, 35.50, 'EUR'),
        (2, 1, TIMESTAMP '2020-06-14 15:00:00', TIMESTAMP '2020-06-14 18:30:00', 2, 35455, 1, 25.45, 'EUR'),
        (3, 1, TIMESTAMP '2020-06-15 00:00:00', TIMESTAMP '2020-06-15 11:00:00', 3, 35455, 1, 30.50, 'EUR'),
        (4, 1, TIMESTAMP '2020-06-15 16:00:00', TIMESTAMP '2020-12-31 23:59:59', 4, 35455, 1, 38.95, 'EUR');
