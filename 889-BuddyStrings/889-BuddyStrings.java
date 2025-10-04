// Last updated: 04/10/2025, 15:51:51
class Solution {
    public boolean buddyStrings(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        if(s.equals(goal)){
            return checkFreq(s);
        }
        List<Integer> lt = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=goal.charAt(i)){
                lt.add(i);
            }
        }
        if(lt.size()!=2){
            return false;
        }
        return s.charAt(lt.get(0)) == goal.charAt(lt.get(1)) && s.charAt(lt.get(1)) == goal.charAt(lt.get(0));
    }
    public boolean checkFreq(String s){
        int[] arr = new int[26];
        for(char ch:s.toCharArray()){
            arr[ch-'a']++;
            if(arr[ch-'a']>1){
                return true;
            }
        }
        return false;
    }
    public void swap(char ch1,char ch2){
        char temp = ch1;
        ch1 = ch2;
        ch2 = temp;
    }
}