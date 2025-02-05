import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<String> words = new HashSet<String>();

        for (int i = 0; i < n; i++) {
            words.add(sc.next());
        }

        List<String> arrayedWords = words.stream().sorted((a, b) -> {
            if (a.length() == b.length()) {
                return a.compareTo(b);
            }
            return Integer.compare(a.length(), b.length());
        }).collect(Collectors.toList());

        for (String word : arrayedWords) {
            System.out.println(word);
        }
    }
}