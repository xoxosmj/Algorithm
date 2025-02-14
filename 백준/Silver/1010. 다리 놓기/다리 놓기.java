import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        TestCase[] testCases = new TestCase[t];
        int maxN = 0;
        int maxM = 0;

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            testCases[i] = new TestCase(n, m);
            maxN = Math.max(maxN, n);
            maxM = Math.max(maxM, m);

        }

        int[][] dp = new int[maxN + 1][maxM + 1];

        for (int i = 1; i < dp[0].length; i++) {
            dp[1][i] = i;
        }

        for (int i = 2; i < dp.length; i++) {
            for (int j = i; j < dp[0].length; j++) {
                dp[i][j] = dp[i - 1][j - 1] + dp[i][j - 1];
            }
        }
        for (TestCase testCase : testCases) {
            System.out.println(dp[testCase.n][testCase.m]);
        }
    }
}

class TestCase {
    int n;
    int m;

    public TestCase(int n, int m) {
        this.n = n;
        this.m = m;
    }
}

