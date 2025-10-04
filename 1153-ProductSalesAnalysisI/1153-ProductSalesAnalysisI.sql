-- Last updated: 04/10/2025, 15:51:20
# Write your MySQL query statement below
select Product_name,Sales.year,Sales.price from Sales join Product on Sales.product_id = Product.product_id;