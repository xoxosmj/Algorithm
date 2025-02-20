import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Set<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new HashSet<>());
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        boolean[] visited = new boolean[graph.size()];
        int[] depth = new int[graph.size()];
        Queue<Integer> queue = new LinkedList<>();

        visited[1] = true;
        depth[1] = 0;
        queue.add(1);

        while (!queue.isEmpty()) {
            int cur = queue.poll();
            if (depth[cur] == 2) {
                continue;
            }

            for (int friend : graph.get(cur)) {
                if (!visited[friend]) {
                    visited[friend] = true;
                    depth[friend] = depth[cur] + 1;

                    if (depth[friend] < 2) {
                        queue.add(friend);
                    }
                }
            }
        }

        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (depth[i] == 1 || depth[i] == 2) {
                count++;
            }
        }
        System.out.println(count);
    }

}
