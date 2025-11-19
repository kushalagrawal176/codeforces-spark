import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        // Convert both strings to lowercase
        a = a.toLowerCase();
        b = b.toLowerCase();

        // Lexicographical comparison
        if (a.compareTo(b) < 0)
            System.out.println(-1);
        else if (a.compareTo(b) > 0)
            System.out.println(1);
        else
            System.out.println(0);
    }
}
