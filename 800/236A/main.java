import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        // Use HashSet to store distinct characters
        HashSet<Character> distinctChars = new HashSet<>();
        for (char c : s.toCharArray()) {
            distinctChars.add(c);
        }

        if (distinctChars.size() % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
    }
}