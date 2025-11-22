import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        if (n < 26) {
            System.out.println("NO");
            return;
        }

        // Use a HashSet to store distinct letters
        Set<Character> letters = new HashSet<>();
        for (char c : s.toLowerCase().toCharArray()) {
            letters.add(c);
        }

        if (letters.size() == 26) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
