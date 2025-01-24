class Solution {
    public int solution(int[] numbers) {
        int x = 0;
        int y = 0;

        for(int i : numbers){
            if(i>x){
                y=x;
                x=i;
            } else if(i>y){
                y=i;
            }
        }
        return x*y;
    }
}