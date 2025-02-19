
import java.util.Scanner;

public class Main {

    static int[] arr;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int tc = 0; tc < t; tc++) {
            int n = sc.nextInt();
            arr = new int[n + 1];
            visited = new boolean[n + 1];

            for (int i = 0; i < n; i++) {
                arr[i + 1] = sc.nextInt();
            }

            int cycleCount = 0;
            for (int i = 1; i <= n; i++) {
                if (!visited[i]) {
                    dfs(i);
                    cycleCount++;
                }
            }
            System.out.println(cycleCount);

        }


    }

    public static void dfs(int index) {
        if (visited[index]) {
            return;
        }
        visited[index] = true;
        dfs(arr[index]);
    }
}


