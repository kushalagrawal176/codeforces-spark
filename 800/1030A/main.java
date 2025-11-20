import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // number of problems
        int cnt = 0;            // count of hard problems

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt(); // difficulty of problem (0 = easy, 1 = hard)
            if (a == 1) {
                cnt++;
            }
        }

        if (cnt > 0) {
            System.out.println("HARD");
        } else {
            System.out.println("EASY");
        }
    }
}
