# Last updated: 04/10/2025, 15:50:59
class Solution:
    def average(self, salary: List[int]) -> float:
        salary.sort()
        n=len(salary)
        sum = 0
        for i in range(1,n-1):
            sum = sum+salary[i]
        average_salary = sum/(n-2)
        return average_salary
