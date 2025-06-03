class Solution {
    public int solution(int n) {
        int num = 0;
        int count = 0;
        while (count < n) {
            num++;
            if (num % 3 == 0 || String.valueOf(num).contains("3")) {
                continue;
            }
            count++;
        }
        return num;
    }
}
