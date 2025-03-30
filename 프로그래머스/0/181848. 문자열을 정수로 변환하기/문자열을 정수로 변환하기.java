class Solution {
    public int solution(String str) {
        boolean hasLetter = false;
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                sb.append(c);
            } else {
                hasLetter = true;
                sb.append('0');
            }
        }

        int result = Integer.parseInt(sb.toString());

        if (hasLetter) {
            result -= 50;
        }

        return result;
    }
}
