// Last updated: 04/10/2025, 15:50:15
class Solution {
    public int largestVariance(String s) {
        int[] arr = new int[26];
        for(char ch : s.toCharArray()){
            arr[ch -'a'] = 1;
        }
        int result = 0;
        for(char first = 'a';first<='z';first++){
            for(char second = 'a';second<='z';second++){
                if(arr[first-'a'] == 0 || arr[second-'a'] == 0){
                    continue;
                }
                int firstcount = 0;
                int secondcount = 0;
                boolean past = false;
                for(char ch : s.toCharArray()){
                    if(ch == first){
                        firstcount++;
                    }
                    if(ch == second){
                        secondcount++;
                    }
                    if(secondcount > 0){
                        result = Math.max(result,firstcount - secondcount);
                    }
                    else{
                        if(past == true){
                            result = Math.max(result,firstcount - 1);
                        }
                    }
                    if(secondcount > firstcount){
                        firstcount = 0;
                        secondcount = 0;
                        past = true;
                    }
                }
            }
        }
        return result;
    }
}