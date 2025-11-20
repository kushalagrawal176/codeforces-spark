import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();
        y++; // start checking from the next year

        while (true) {
            if (isBeautiful(y)) {
                System.out.println(y);
                break;
            }
            y++;
        }
    }

    // Helper function to check if all digits are unique
    private static boolean isBeautiful(int year) {
        String s = Integer.toString(year);
        HashSet<Character> digits = new HashSet<>();

        for (char c : s.toCharArray()) {
            if (!digits.add(c)) { // if digit already exists, not beautiful
                return false;
            }
        }
        
        return true;
    }
}
