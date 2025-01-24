class Solution {
    public int solution(int[] array, int height) {
        int count = 0;
        for(int friendsHeight : array){
            if (friendsHeight > height){
                count++;
            }
        
        }
        return count;
    }
}