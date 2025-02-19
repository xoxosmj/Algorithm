import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        do {
            List<String> list = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                list.add(sc.next());
            }
            list.sort(String::compareToIgnoreCase);
            System.out.println(list.get(0));
            n = sc.nextInt();
        }
        while (n != 0);
    }
}

