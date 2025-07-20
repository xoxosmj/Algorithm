import java.util.HashSet;

class Solution {
    public int solution(String[] spell, String[] dic) {
        HashSet<Character> setSpell = new HashSet<>();
        for (String s : spell) {
            setSpell.add(s.charAt(0));
        }
        boolean isMatched = false;
        for (String word : dic) {
            if (word.length() != spell.length) continue;
            HashSet<Character> setWord = new HashSet<>();
            for (char c : word.toCharArray()) {
                setWord.add(c);
            }
            if (setSpell.equals(setWord)) {
                isMatched = true;
                break;
            }
        }
        return isMatched ? 1 : 2;
    }
}
