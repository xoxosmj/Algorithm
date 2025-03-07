import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        int cur = 0;

        while (true) {
            if (cur == k) {
                System.out.println(count);
                return;
            }
            if (visited[cur]) {
                System.out.println(-1);
                return;
            }
            visited[cur] = true;
            cur = arr[cur];
            count++;
        }


    }
}