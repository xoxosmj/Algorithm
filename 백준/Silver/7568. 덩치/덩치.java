import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<People> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            People p = new People();
            p.setWeight(sc.nextInt());
            p.setHeight(sc.nextInt());
            list.add(p);
        }

        for (People p : list) {
            int rank = 0;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getWeight() > p.getWeight() && list.get(i).getHeight() > p.getHeight()) {
                    rank++;
                }
            }
            p.setRank(rank + 1);
        }
        list.forEach(p -> System.out.print(p.getRank() + " "));
    }
}

class People {

    private int weight;
    private int height;
    private int rank;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}

