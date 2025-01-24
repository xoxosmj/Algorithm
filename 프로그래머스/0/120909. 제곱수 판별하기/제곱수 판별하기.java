class Solution {
    public int solution(int n) {
    for(int i = 1; i<100000; i++){
        if(n/i == i && n%i == 0){
            return 1;
        }   
    }
    return 2;
    }
}