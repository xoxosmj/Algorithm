import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Member[] members = new Member[n];

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            String[] parts = line.split(" ");
            members[i] = new Member(Integer.parseInt(parts[0]), parts[1]);
        }

        Arrays.sort(members, (o1, o2) -> Integer.compare(o1.age, o2.age));

        for (int i = 0; i < n; i++) {
            System.out.println(members[i].age + " " + members[i].name);
        }

    }

}

class Member {
    int age;
    String name;

    public Member(int age, String name) {
        this.age = age;
        this.name = name;
    }
}