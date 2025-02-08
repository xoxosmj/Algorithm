import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        while (true) {
            for (int i = 0; i < 4; i++) {
                int j = i + 1;

                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;

                    for (int k = 0; k < 5; k++) {
                        if (k == 4) {
                            System.out.print(arr[k] + "\n");
                        } else {
                            System.out.print(arr[k] + " ");
                        }

                    }
                }
            }


            if (Arrays.equals(arr, new int[]{1, 2, 3, 4, 5})) {
                break;
            }
        }
    }
}