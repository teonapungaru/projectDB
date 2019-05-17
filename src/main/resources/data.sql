
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

insert into cars (model, engine, horse_power, fuel_type, price, sale_id) values ('BMW', 2.1, 200, 'diesel', 25000, 3);
insert into cars (model, engine, horse_power, fuel_type, price, sale_id) values ('Audi', 1.8, 180, 'benzina', 20000, 1);
insert into cars (model, engine, horse_power, fuel_type, price, sale_id) values ('Dacia', 1.3, 80, 'diesel', 7000, 2);
insert into cars (model, engine, horse_power, fuel_type, price, sale_id) values ('VW', 1.7, 150, 'diesel', 10000, 5);
insert into cars (model, engine, horse_power, fuel_type, price, sale_id) values ('Toyota', 1.5, 100, 'benzina', 9500, 4);

--Accessories

insert into accessories (name, price) values ('stergatoare', 20.5);
insert into accessories (name, price) values ('odorizant', 30);
insert into accessories (name, price) values ('solutie parbriz', 15);
insert into accessories (name, price) values ('ulei', 21);
insert into accessories (name, price) values ('becuri', 5.5);

--Transaction

insert into transactions (accessories_id, sale_id, quantity) values (1, 1, 8);
insert into transactions (accessories_id, sale_id, quantity) values (2, 2, 24);
insert into transactions (accessories_id, sale_id, quantity) values (1, 3, 10);
insert into transactions (accessories_id, sale_id, quantity) values (3, 4, 22);
insert into transactions (accessories_id, sale_id, quantity) values (4, 1, 15);



