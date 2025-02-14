import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        List<Address> addressList = new ArrayList<Address>();

        for (int i = 0; i < testCase; i++) {
            Address address = new Address();
            address.setK(sc.nextInt());
            address.setN(sc.nextInt());
            addressList.add(address);
        }

        for (Address address : addressList) {
            System.out.println(getResident(address.getK(), address.getN()));
        }

    }

    public static int getResident(int k, int n) {
        int resident = 0;

        if (k == 0) {
            resident = n;
        }

        if (k > 0) {
            if (n == 1) {
                return 1;
            } else if (n >= 2) {
                resident = getResident(k - 1, n) + getResident(k, n - 1);

            }
        }
        return resident;
    }

}

class Address {
    private int k;
    private int n;


    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
}

