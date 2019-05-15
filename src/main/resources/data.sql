
-- Customer

insert into customer (first_name, last_name) values ('john', 'doe');
insert into customer (first_name, last_name) values ('jane', 'deo');
insert into customer (first_name, last_name) values ('nico', 'problema');
insert into customer (first_name, last_name) values ('bitchface', 'lupascu');
insert into customer (first_name, last_name) values ('john1', 'doe1');

-- Contact

insert into contact (city, street, phone_no, customer_id) values ('London', 'Baker', '0720021997', 2);
insert into contact (city, street, phone_no, customer_id) values ('Chicago', 'Flower Street', '0754021997', 1);
insert into contact (city, street, phone_no, customer_id) values ('New York', 'Bla Street', '0720089997', 4);
insert into contact (city, street, phone_no, customer_id) values ('Iasi', 'Palat', '0720021456', 5);
insert into contact (city, street, phone_no, customer_id) values ('Vaslui', 'Bar', '0720075897', 3);

-- Sale

insert into sale (quantity, acquisition_date, customer_id) values (3, now(), 2);
insert into sale (quantity, acquisition_date, customer_id) values (2, now(), 3);
insert into sale (quantity, acquisition_date, customer_id) values (1, now(), 1);
insert into sale (quantity, acquisition_date, customer_id) values (10, now(), 4);
insert into sale (quantity, acquisition_date, customer_id) values (20, now(), 5);

-- Car

insert into car (model, engine, horse_power, fuel_type, price, sale_id) values ('BMW', 2.1, 200, 'diesel', 25000, 3);
insert into car (model, engine, horse_power, fuel_type, price, sale_id) values ('Audi', 1.8, 180, 'benzina', 20000, 1);
insert into car (model, engine, horse_power, fuel_type, price, sale_id) values ('Dacia', 1.3, 80, 'diesel', 7000, 2);
insert into car (model, engine, horse_power, fuel_type, price, sale_id) values ('VW', 1.7, 150, 'diesel', 10000, 5);
insert into car (model, engine, horse_power, fuel_type, price, sale_id) values ('Toyota', 1.5, 100, 'benzina', 9500, 4);

--Accessories

insert into accessories (name, price, sale_id) values ('stergatoare', 20.5, 3);
insert into accessories (name, price, sale_id) values ('odorizant', 30, 1);
insert into accessories (name, price, sale_id) values ('solutie parbriz', 15, 2);
insert into accessories (name, price, sale_id) values ('ulei', 21, 4);
insert into accessories (name, price, sale_id) values ('becuri', 5.5, 5);



