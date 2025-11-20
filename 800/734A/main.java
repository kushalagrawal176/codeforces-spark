import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // number of games
        String s = sc.next();   // results string

        int cnt = 0;

        // Count how many games Anton won ('A')
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                cnt++;
            }
        }

        // Compare Anton's wins vs Danik's wins
        if (cnt > s.length() - cnt) {
            System.out.println("Anton");
        } else if (cnt < s.length() - cnt) {
            System.out.println("Danik");
        } else {
            System.out.println("Friendship");
        }
    }
}
