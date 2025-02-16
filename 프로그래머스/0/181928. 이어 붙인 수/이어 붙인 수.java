public class Solution {
    public static int solution(int[] num_list) {
        StringBuilder oddStr = new StringBuilder();
        StringBuilder evenStr = new StringBuilder();

        for (int num : num_list) {
            if (num % 2 == 1) { 
                oddStr.append(num);
            } else { 
                evenStr.append(num);
            }
        }

        
        int oddNum = Integer.parseInt(oddStr.toString());
        int evenNum = Integer.parseInt(evenStr.toString());

        return oddNum + evenNum;
    }

}