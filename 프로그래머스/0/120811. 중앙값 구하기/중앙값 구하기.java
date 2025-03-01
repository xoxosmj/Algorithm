import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        int medianIndex = array.length / 2;
        return array[medianIndex];
    }
}