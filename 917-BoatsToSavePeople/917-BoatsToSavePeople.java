// Last updated: 04/10/2025, 15:51:46
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int n = people.length;
        Arrays.sort(people);
        int i=0;
        int j = n-1;
        int count = 0;
        while(i<=j){
            if(people[i]+people[j]>limit){
                j--;
                count++;
            }
            else if(people[i]+people[j]<=limit){
                i++;
                j--;
                count++;
            }
        }
        return count;
    }
}