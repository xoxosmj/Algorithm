import java.util.ArrayList;
class Solution {
    public int[] solution(int n, int[] numlist) {
       ArrayList<Integer> result = new ArrayList<>();

        for (int num : numlist) {
            if (num % n == 0) {
                result.add(num);
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}