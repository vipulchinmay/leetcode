-- Last updated: 04/10/2025, 15:51:17
# Write your MySQL query statement below
select distinct author_id as "id" from Views where author_id = viewer_id order by author_id;