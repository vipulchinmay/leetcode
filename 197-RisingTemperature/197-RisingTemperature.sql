-- Last updated: 04/10/2025, 15:53:43
# Write your MySQL query statement below
select w1.id from Weather w1 join Weather w2 on date_add(W2.recordDate,interval 1 day) = w1.recordDate where w1.temperature>w2.temperature;