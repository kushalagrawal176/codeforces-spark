import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // number of stones
        String s = sc.next();   // string representing colors of stones

        int cnt = 0;
        for (int i = 0; i < n;) {
            int j = i + 1;
            while (j < n && s.charAt(j) == s.charAt(i)) {
                cnt++;   // count stones that must be removed
                j++;
            }
            i = j;       // move to next different stone
        }

        System.out.println(cnt);
    }
}
