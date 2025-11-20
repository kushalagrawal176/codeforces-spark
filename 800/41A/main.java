import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String t = sc.next();

        // Reverse string s
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();

        if (sb.toString().equals(t)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
