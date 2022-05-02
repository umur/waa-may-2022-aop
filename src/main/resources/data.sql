Delete from address;
Delete from users;
Delete from product;
Delete from category;
Delete from review;

INSERT INTO users (id,email,first_name,last_name,password) VALUES (1,'test@gmail.com','test','test','test123');
INSERT INTO users (id,email,first_name,last_name,password) VALUES (2,'test2@gmail.com','test2','last','test123');

INSERT INTO address (id,city,street,zip,user_id) VALUES (1,'Fairfield','1000 N 4th','52557',1);
INSERT INTO address (id,city,street,zip,user_id) VALUES (2,'Fairfield','1000 N 4th','52557',2);

INSERT INTO category (id,name) VALUES (1,'Electronic');
INSERT INTO category (id,name) VALUES (2,'Beauty');
INSERT INTO category (id,name) VALUES (3,'Clothing');

INSERT INTO product (id,name,price,rating,category_id,user_id) VALUES (1,'iPhone',1000.0,4.9,1,1);
INSERT INTO product (id,name,price,rating,category_id,user_id) VALUES (2,'MacBook',1000.0,4.9,1,1);
INSERT INTO product (id,name,price,rating,category_id,user_id) VALUES (3,'iPad',1000.0,4.5,1,1);
INSERT INTO product (id,name,price,rating,category_id,user_id) VALUES (4,'Winter Jacket',100.0,4.5,3,1);
INSERT INTO product (id,name,price,rating,category_id,user_id) VALUES (5,'Winter Boots',50.0,4.0,3,2);

INSERT INTO review (id,comment,user_id,product_id) VALUES (1,'Good',1,1);
INSERT INTO review (id,comment,user_id,product_id) VALUES (2,'Very Good',2,1);