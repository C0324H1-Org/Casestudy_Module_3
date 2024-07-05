CREATE DATABASE if not exists casestudy_module_3;
USE casestudy_module_3;

CREATE TABLE if not exists Users (
     user_id INT AUTO_INCREMENT PRIMARY KEY,
     username VARCHAR(50) NOT NULL UNIQUE,
     password VARCHAR(100) NOT NULL
);

CREATE TABLE if not exists category (
    category_id INT PRIMARY KEY,
    category_name VARCHAR(50)
);

CREATE TABLE if not exists product (
    product_id INT AUTO_INCREMENT PRIMARY KEY,
    category_id INT,
    product_name VARCHAR(100) NOT NULL,
    producer VARCHAR(100) NOT NULL,
    description TEXT,
    price DECIMAL(10, 2) NOT NULL,
    image VARCHAR(255),
    FOREIGN KEY (category_id) REFERENCES category (category_id)
);

CREATE TABLE if not exists product_color (
    color_id INT AUTO_INCREMENT PRIMARY KEY,
    color VARCHAR (50)
);

CREATE TABLE if not exists product_ram (
    ram_id INT AUTO_INCREMENT PRIMARY KEY,
    ram VARCHAR (50)
);

CREATE TABLE if not exists product_rom (
    rom_id INT AUTO_INCREMENT PRIMARY KEY,
    rom VARCHAR(50)
);

CREATE TABLE if not exists product_detail (
    product_detail_id  INT AUTO_INCREMENT PRIMARY KEY,
    product_id INT NOT NULL,
    color_id INT NOT NULL,
    ram_id INT NOT NULL,
    rom_id INT NOT NULL,
    display VARCHAR(20),
    camera VARCHAR(20),
    battery VARCHAR (30),
    FOREIGN KEY (product_id) REFERENCES product (product_id),
    FOREIGN KEY (color_id) REFERENCES product_color (color_id),
    FOREIGN KEY (ram_id) REFERENCES product_ram (ram_id),
    FOREIGN KEY (rom_id) REFERENCES product_rom (rom_id)
);

CREATE TABLE if not exists customer (
    customer_id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT,
    customer_name VARCHAR (100) NOT NULL,
    customer_phone VARCHAR (10),
    customer_address VARCHAR (100),
    FOREIGN KEY (user_id) REFERENCES Users(user_id)
);

CREATE TABLE if not exists product_status (
    status_id INT AUTO_INCREMENT PRIMARY KEY,
    stauts_name VARCHAR(50)
);

CREATE TABLE if not exists orders (
    order_id INT AUTO_INCREMENT PRIMARY KEY,
    customer_id INT,
    product_detail_id INT,
    status_id INT,
    FOREIGN KEY (customer_id) REFERENCES customer (customer_id),
    FOREIGN KEY (product_detail_id) REFERENCES product_detail (product_detail_id),
    FOREIGN KEY (status_id) REFERENCES product_status (status_id)
);

insert into category (category_id, category_name) values
(1, 'Apple');

insert into product (product_id, category_id, product_name, producer, description, price, image)
values
(1, 1, 'IPhone 15 Pro', 'Apple', 'Camera độ phân giải cao, chống nước ip68', 1500.00, '/images/iphone13.png'),
(2, 1, 'IPhone 15 Promax', 'Apple', 'Màn hình lớn, chip mới mạnh mẽ, tích hợp công nghệ AI', 1800.00, '/images/iphone15promax.jpeg'),
(3, 1, 'IPhone 14 Promax', 'Apple', 'Cải tiếng tai thỏ mới siêu hiện đại, bo gốc lịch lãm', 1400.00, '/images/iphone14promax.png'),
(4, 1, 'IPhone 13 Promax', 'Apple', 'Thời lượng pin đã được cải thiện, sạc nhanh 25w mới', 1250.00, '/images/iphone13pro.png');