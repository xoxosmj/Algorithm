class Solution {
    public int solution(int[] numbers) {
        int x = 0;
        int y = 0;
        for(int i : numbers){
        if (i > x){
            x = i;
            }else if (i == x){
            y = i;
            }
        }
        if (y!=0){
            return x*y;
        }else{
            for(int i :numbers){
                if (i>y&&i<x){
                    y=i;
                }
                
            }
            return x*y;
        }
        
    }
}