import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> dwarfs = new ArrayList<>();
        int totalSum = 0;

        for (int i = 0; i < 9; i++) {
            dwarfs.add(sc.nextInt());
            totalSum += dwarfs.get(i);
        }

        int target = totalSum - 100;
        dwarfs.sort(Integer::compareTo);

        for (int leftPointer = 0; leftPointer < dwarfs.size(); leftPointer++) {
            for (int rightPointer = leftPointer + 1; rightPointer < dwarfs.size(); rightPointer++) {
                if (dwarfs.get(leftPointer) + dwarfs.get(rightPointer) == target) {
                    for (int i = 0; i < 9; i++) {
                        if (i != leftPointer && i != rightPointer) {
                            System.out.println(dwarfs.get(i));
                        }

                    }
                    return;
                }
            }
        }
    }
}