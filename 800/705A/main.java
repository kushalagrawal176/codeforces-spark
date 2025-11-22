import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        StringBuilder s = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                s.append("I love ");
            } else {
                s.append("I hate ");
            }

            if (i < n) {
                s.append("that ");
            } else {
                s.append("it");
            }
        }

        System.out.println(s.toString());
    }
}
