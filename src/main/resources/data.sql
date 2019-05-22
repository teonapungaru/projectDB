
-- Customer

insert into customers (first_name, last_name) values ('john', 'doe');
insert into customers (first_name, last_name) values ('jane', 'deo');
insert into customers (first_name, last_name) values ('nico', 'problema');
insert into customers (first_name, last_name) values ('bitchface', 'lupascu');
insert into customers (first_name, last_name) values ('john1', 'doe1');

-- Contact

insert into contacts (city, street, phone_no, customer_id) values ('London', 'Baker', '0720021597', 2);
insert into contacts (city, street, phone_no, customer_id) values ('Chicago', 'Flower Street', '0754021997', 1);
insert into contacts (city, street, phone_no, customer_id) values ('New York', 'Bla Street', '0720089997', 4);
insert into contacts (city, street, phone_no, customer_id) values ('Iasi', 'Palat', '0720021456', 5);
insert into contacts (city, street, phone_no, customer_id) values ('Vaslui', 'Bar', '0720075897', 3);

-- Sale

insert into sales (acquisition_date, customer_id) values (now(), 2);
insert into sales (acquisition_date, customer_id) values (now(), 3);
insert into sales (acquisition_date, customer_id) values (now(), 1);
insert into sales (acquisition_date, customer_id) values (now(), 4);
insert into sales (acquisition_date, customer_id) values (now(), 5);

-- Car

insert into cars (model, engine, horse_power, fuel_type, price, sale_id, image) values ('BMW', 2.1, 200, 'diesel', 25000, 3, 'https://cache4.pakwheels.com/system/car_generation_pictures/4681/original/BMW_X4_2017.jpg?1506086880');
insert into cars (model, engine, horse_power, fuel_type, price, sale_id, image) values ('Audi', 1.8, 180, 'benzina', 20000, 1, 'https://hips.hearstapps.com/amv-prod-cad-assets.s3.amazonaws.com/vdat/submodels/audi_a3_audi-a3-sedan_2019-1552084281910.jpg');
insert into cars (model, engine, horse_power, fuel_type, price, sale_id, image) values ('Dacia', 1.3, 80, 'diesel', 7000, 2, 'https://www.dacia-liban.com/CountriesData/Lebanon_EN/images/cars/loganmcv/paints/ImageFromBookmark0_ig_w600_h337.jpg');
insert into cars (model, engine, horse_power, fuel_type, price, sale_id, image) values ('VW', 1.7, 150, 'diesel', 10000, 5, 'https://imgd.aeplcdn.com/1280x720/cw/ec/21603/Volkswagen-Ameo-Exterior-119016.jpg?wm=0&q=100');
insert into cars (model, engine, horse_power, fuel_type, price, sale_id, image) values ('Toyota', 1.5, 100, 'benzina', 9500, 4, 'https://s3.caradvice.com.au/wp-content/uploads/2018/09/toyota_corolla.jpg');

--Accessories

insert into accessories (name, price, image) values ('stergatoare', 20.5, 'https://s12emagst.akamaized.net/products/8271/8270596/images/res_2b31151a0fa46bf6a5ed9a736d707629_full.jpg');
insert into accessories (name, price, image) values ('odorizant', 30, 'https://i.dedeman.ro/media/catalog/product/cache/dedeman/image/300x300/17f82f742ffe127f42dca9de82fb58b1/1/0/1025942_1.jpg');
insert into accessories (name, price, image) values ('solutie parbriz', 15, 'https://higimag.ro/image/cache/Detergenti%20auto/solutie%20parbriz-800x800.jpg');
insert into accessories (name, price, image) values ('ulei', 21, 'https://s12emagst.akamaized.net/products/659/658406/images/res_edfdcf1a2289d5f486d49ce4b6df4c55_450x450_spl1.jpg');
insert into accessories (name, price, image) values ('becuri', 5.5, 'https://cdna.altex.ro/resize/media/catalog/product/b/e/2bd48d28d1c32adea0e55139a4e6434a/bec-far-vision-12972prc1-1_1.jpg');

--Transaction

insert into transactions (accessories_id, sale_id, quantity) values (1, 1, 8);
insert into transactions (accessories_id, sale_id, quantity) values (2, 2, 24);
insert into transactions (accessories_id, sale_id, quantity) values (1, 3, 10);
insert into transactions (accessories_id, sale_id, quantity) values (3, 4, 22);
insert into transactions (accessories_id, sale_id, quantity) values (4, 1, 15);



