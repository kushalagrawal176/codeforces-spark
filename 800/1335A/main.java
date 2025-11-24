import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  // number of test cases

        while (n-- > 0) {
            int a = sc.nextInt();

            if (a % 2 == 0) {
                System.out.println(a / 2 - 1);
            } else {
                System.out.println(a / 2);
            }
        }
    }
}
