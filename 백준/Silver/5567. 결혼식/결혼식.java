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

        Set<Integer> invited = new HashSet<>();
        graph.get(1).stream().forEach(invited::add);

        for (int i = 2; i < graph.size(); i++) {
            if (graph.get(i).contains(1)) {
                invited.addAll(graph.get(i));
            }
        }
        invited.remove(1);
        System.out.println(invited.size());

    }


}
