import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<List<Integer>> cards = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            cards.add(new ArrayList<>());
            for (int j = 0; j < 5; j++) {
                cards.get(i).add(sc.nextInt());
            }
        }

        int winner = 0;
        int bestScore = -1;

        for (int i = 0; i < n; i++) {
            List<Integer> cardSet = cards.get(i);
            int maxScore = 0;

            for (int a = 0; a < 3; a++) {
                for (int b = a + 1; b < 4; b++) {
                    for (int c = b + 1; c < 5; c++) {
                        int score = (cardSet.get(a) + cardSet.get(b) + cardSet.get(c)) % 10;
                        if (score > maxScore) {
                            maxScore = score;
                        }
                    }
                }
            }
            if (maxScore >= bestScore) {
                winner = i;
                bestScore = maxScore;
            }

        }
        System.out.println(winner + 1);

    }

}
