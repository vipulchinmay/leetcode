// Last updated: 04/10/2025, 15:52:23
class Solution {
    public int calPoints(String[] operations) {
        List<Integer> lt = new ArrayList<>();
        for (String s : operations) {
            if (s.equals("C")) {
                lt.remove(lt.size() - 1);
            }
            else if (s.equals("D")) {
                lt.add(lt.get(lt.size() - 1) * 2);

            }
            else if (s.equals("+")) {

                int n = lt.get(lt.size() - 1) + lt.get(lt.size() - 2);
                lt.add(n);

            } else {
                lt.add(Integer.parseInt(s));
            }
        }
        int sum = 0;
        for (Integer s : lt) {
            sum += s;
        }
        return sum;
    }
}