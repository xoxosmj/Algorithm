class Solution {
    public String solution(String my_string, int n) {
       String[] spiltedString = my_string.split("");
       String answer = "";
       for(int i = 0; i < my_string.length(); i++){
           answer += spiltedString[i].repeat(n);
       }
       return answer;
    }
}