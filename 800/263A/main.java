import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = 0, col = 0;

        // Read the 5x5 matrix
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int a = sc.nextInt();
                if (a == 1) {
                    // Store the position (1-based index)
                    row = i + 1;
                    col = j + 1;
                }
            }
        }

        // Calculate Manhattan distance to center (3,3)
        int moves = Math.abs(row - 3) + Math.abs(col - 3);

        System.out.println(moves);
    }
}
