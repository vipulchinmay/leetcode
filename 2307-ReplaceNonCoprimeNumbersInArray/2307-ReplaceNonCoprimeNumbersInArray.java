// Last updated: 04/10/2025, 15:50:19
import java.util.*;

class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        List<Integer> stack = new ArrayList<>();
        
        for (int num : nums) {
            stack.add(num);
            while (stack.size() >= 2) {
                int a = stack.get(stack.size() - 1);
                int b = stack.get(stack.size() - 2);
                int g = gcd(a, b);
                
                if (g == 1) break; 
                
                int lcm = (int)((long)a / g * b); 
                stack.remove(stack.size() - 1);
                stack.remove(stack.size() - 1);
                stack.add(lcm);
            }
        }
        
        return stack;
    }
    
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
