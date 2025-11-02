-- Insert sample users
INSERT INTO users (first_name, last_name, email, password_hash, phone_number, address, city, state, zip_code) VALUES
('John', 'Doe', 'john.doe@email.com', 'hashed_password_1', '123-456-7890', '123 Main St', 'New York', 'NY', '10001'),
('Jane', 'Smith', 'jane.smith@email.com', 'hashed_password_2', '123-456-7891', '456 Oak Ave', 'New York', 'NY', '10002'),
('Mike', 'Johnson', 'mike.johnson@email.com', 'hashed_password_3', '123-456-7892', '789 Pine Rd', 'New York', 'NY', '10003');

-- Insert sample restaurants
INSERT INTO restaurants (name, description, cuisine_type, address, city, state, zip_code, phone_number, opening_time, closing_time, delivery_fee, min_order_amount) VALUES
('Pizza Palace', 'Best pizza in town with fresh ingredients', 'Italian', '123 Pizza St', 'New York', 'NY', '10001', '123-555-0001', '10:00:00', '22:00:00', 2.99, 15.00),
('Burger Barn', 'Gourmet burgers and fries', 'American', '456 Burger Ave', 'New York', 'NY', '10002', '123-555-0002', '11:00:00', '23:00:00', 1.99, 12.00),
('Sushi Spot', 'Fresh sushi and Japanese cuisine', 'Japanese', '789 Sushi Rd', 'New York', 'NY', '10003', '123-555-0003', '12:00:00', '21:00:00', 3.99, 20.00);

-- Insert categories
INSERT INTO categories (name, description, restaurant_id) VALUES
('Pizzas', 'Various types of pizzas', 1),
('Sides', 'Appetizers and sides', 1),
('Burgers', 'Gourmet burgers', 2),
('Sides', 'French fries and onion rings', 2),
('Sushi Rolls', 'Traditional and special rolls', 3),
('Appetizers', 'Japanese appetizers', 3);

-- Insert menu items
INSERT INTO menu_items (name, description, price, category_id, restaurant_id, preparation_time, calories) VALUES
('Margherita Pizza', 'Classic pizza with tomato sauce and mozzarella', 12.99, 1, 1, 20, 800),
('Pepperoni Pizza', 'Pizza with pepperoni and cheese', 14.99, 1, 1, 20, 850),
('Garlic Bread', 'Fresh baked garlic bread', 4.99, 2, 1, 10, 300),
('Classic Burger', 'Beef burger with lettuce and tomato', 9.99, 3, 2, 15, 600),
('California Roll', 'Crab, avocado, cucumber', 8.99, 5, 3, 10, 350);

-- Insert delivery personnel
INSERT INTO delivery_personnel (first_name, last_name, phone_number, email, vehicle_type, vehicle_number) VALUES
('Tom', 'Wilson', '123-777-8888', 'tom.wilson@delivery.com', 'Motorcycle', 'NY-1234'),
('Sarah', 'Chen', '123-777-8889', 'sarah.chen@delivery.com', 'Car', 'NY-5678');