import java.util.*;

class Solution {
    public String solution(String letter) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",
                          ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",
                          "...","-","..-","...-",".--","-..-","-.--","--.."};
        Map<String, String> morseMap = new HashMap<>();
        for (int i = 0; i < morse.length; i++) {
            morseMap.put(morse[i], String.valueOf((char)('a' + i)));
        }
        
        StringBuilder answer = new StringBuilder();
        String[] codes = letter.split(" ");
        for (String code : codes) {
            answer.append(morseMap.get(code));
        }
        return answer.toString();
    }
}
