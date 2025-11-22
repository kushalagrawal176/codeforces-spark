import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();  // number of test cases

        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a % b != 0) {
                System.out.println(((a / b) + 1) * b - a);
            } else {
                System.out.println(0);
            }
        }
    }
}
