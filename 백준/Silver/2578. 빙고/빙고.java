import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Position> board = new HashMap<>();
        int row = 0;
        int col = 0;

        for (int i = 0; i < 25; i++) {
            if (i % 5 == 0) {
                if (i != 0) {
                    row++;
                }
                col = 0;

            }
            board.put(sc.nextInt(), new Position(row, col));
            col++;
        }

        boolean[][] marked = new boolean[5][5];

        for (int i = 0; i < 25; i++) {
            Position p = board.get(sc.nextInt());
            marked[p.getRow()][p.getCol()] = true;
            if (checkBingo(marked) >= 3) {
                System.out.println(i + 1);
                break;
            }
        }
    }

    public static int checkBingo(boolean[][] marked) {
        int bingo = 0;

        for (int row = 0; row < marked.length; row++) {
            int count = 0;

            for (int col = 0; col < marked[row].length; col++) {

                if (marked[row][col]) {
                    count++;
                }
            }
            if (count == marked[row].length) {
                bingo++;
            }
        }
        for (int col = 0; col < marked[0].length; col++) {
            int count = 0;
            for (int row = 0; row < marked.length; row++) {
                if (marked[row][col]) {
                    count++;

                }
            }
            if (count == marked.length) {
                bingo++;
            }
        }

        if (marked[0][0] == true && marked[1][1] == true && marked[2][2] == true && marked[3][3] == true && marked[4][4] == true) {
            bingo++;
        }

        if (marked[0][4] == true && marked[1][3] == true && marked[2][2] == true && marked[3][1] == true && marked[4][0] == true) {
            bingo++;
        }
        return bingo;

    }
}

class Position {
    int row;
    int col;

    public Position(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }
}

