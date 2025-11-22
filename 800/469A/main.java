import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  // total number of levels

        int p = sc.nextInt();  // number of levels Little X can pass
        Set<Integer> levels = new HashSet<>();

        for (int i = 0; i < p; i++) {
            levels.add(sc.nextInt());
        }

        int q = sc.nextInt();  // number of levels Little Y can pass
        for (int i = 0; i < q; i++) {
            levels.add(sc.nextInt());
        }

        if (levels.size() == n) {
            System.out.println("I become the guy.");
        } else {
            System.out.println("Oh, my keyboard!");
        }
    }
}
