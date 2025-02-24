import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int idx = 0;

        List<Integer> list = new ArrayList<Integer>();
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(i + 1);
        }

        while (!list.isEmpty()) {
            idx += k;
          while (idx>n){
              idx -= n;
          }

            answer.add(list.get(idx - 1));
            list.remove(idx - 1);
            idx--;
            n--;
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        for (int i = 0; i < answer.size(); i++) {
            sb.append(answer.get(i));
            if (i != answer.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append(">");
        System.out.println(sb.toString());

    }

}
