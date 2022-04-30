-- USERS

INSERT INTO users (id, email, first_name, last_name, password)
VALUES (1, 'uinan@miu.edu', 'umur', 'inan', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2'),(2, 'john@miu.edu', 'john', 'doe', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2'),
       (3, 'muhyidean@miu.edu', 'muhyidean', 'al-tarawneh', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2'),
       (4, 'levi@miu.edu', 'keith', 'levi', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2'),
       (5, 'okalu@miu.edu', 'obinna', 'kalu', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2'),
       (6, 'tina@miu.edu', 'tina', 'xing', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2'),
       (7, 'manhnguyen@miu.edu', 'Manh', 'Nguyen', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2'); --123

-- CATEGORIES

INSERT INTO category (id, name)
VALUES (1, 'Phone');

INSERT INTO category (id, name)
VALUES (2, 'Table');

-- PRODUCTS

INSERT INTO product (id, name, price, rating, category_id, created_by_id)
VALUES (1, 'iPhone X', 1200, 4, 1, 7);

INSERT INTO product (id, name, price, rating, category_id, created_by_id)
VALUES (2, 'iPhone 11', 1300, 5, 1, 7);

INSERT INTO product (id, name, price, rating, category_id, created_by_id)
VALUES (3, 'iPhone 13', 2000, 5, 1, 7);

-- REVIEWS

INSERT INTO REVIEW (id,comment,product_id, user_id)
VALUES (1,'awesome phone 1',1, 7);

INSERT INTO REVIEW (id,comment,product_id, user_id)
VALUES (2,'amazing phone 2',1, 7);

INSERT INTO REVIEW (id,comment,product_id, user_id)
VALUES (3,'awesome tablet',2, 7);