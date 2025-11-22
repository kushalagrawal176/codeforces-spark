import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        // Use a HashSet to store distinct colors
        Set<Integer> colors = new HashSet<>();
        colors.add(a);
        colors.add(b);
        colors.add(c);
        colors.add(d);

        // Answer = 4 - number of distinct colors
        System.out.println(4 - colors.size());
    }
}
