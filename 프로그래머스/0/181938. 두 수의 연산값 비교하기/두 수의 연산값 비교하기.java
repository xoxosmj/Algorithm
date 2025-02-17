class Solution {
    public int solution(int a, int b) {

        int concatValue = Integer.parseInt(a + "" + b);
        
     
        int productValue = 2 * a * b;
        
     
        return Math.max(concatValue, productValue);
    }
}