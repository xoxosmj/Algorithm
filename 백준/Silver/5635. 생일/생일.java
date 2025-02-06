import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        TreeMap<Integer, String> studentMap = new TreeMap<>();
        for (int i = 1; i <= n; i++) {
            String line = sc.nextLine();
            String[] parts = line.split(" ");

            String name = parts[0];

            int year = Integer.parseInt(parts[3]);
            int month = Integer.parseInt(parts[2]);
            int day = Integer.parseInt(parts[1]);

            int birthday = year * 10000 + month * 100 + day;

            studentMap.put(birthday, name);

        }
        System.out.println(studentMap.lastEntry().getValue());
        System.out.println(studentMap.firstEntry().getValue());
    }
}