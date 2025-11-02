-- Get available menu items from a restaurant
SELECT mi.name, mi.price, mi.description, c.name as category
FROM menu_items mi
JOIN categories c ON mi.category_id = c.category_id
WHERE mi.restaurant_id = 1 AND mi.is_available = TRUE;

-- Create a new order
INSERT INTO orders (user_id, restaurant_id, total_amount, delivery_address, delivery_fee, tax_amount, final_amount) 
VALUES (1, 1, 27.97, '123 Main St, New York, NY 10001', 2.99, 2.10, 32.06);

-- Add items to order
INSERT INTO order_items (order_id, item_id, quantity, unit_price) 
VALUES 
(LAST_INSERT_ID(), 1, 1, 12.99),
(LAST_INSERT_ID(), 3, 2, 4.99);

-- Update order status
UPDATE orders SET order_status = 'confirmed' WHERE order_id = 1;

-- Get order history for a user
SELECT o.order_id, r.name as restaurant_name, o.total_amount, o.order_status, o.order_date
FROM orders o
JOIN restaurants r ON o.restaurant_id = r.restaurant_id
WHERE o.user_id = 1
ORDER BY o.order_date DESC;

-- Calculate restaurant ratings
SELECT r.name, AVG(rev.rating) as average_rating, COUNT(rev.review_id) as total_reviews
FROM restaurants r
LEFT JOIN reviews rev ON r.restaurant_id = rev.restaurant_id
GROUP BY r.restaurant_id, r.name;