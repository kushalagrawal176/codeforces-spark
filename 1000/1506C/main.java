import java.util.*;

public class main
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) 
        {
            String a = sc.next();
            String b = sc.next();

            int lenA = a.length();
            int lenB = b.length();

            // DP table for longest common substring
            int[][] dp = new int[lenA + 1][lenB + 1];
            int longest = 0;

            for (int i = 1; i <= lenA; i++) {
                for (int j = 1; j <= lenB; j++) {
                    if (a.charAt(i - 1) == b.charAt(j - 1)) {
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                        longest = Math.max(longest, dp[i][j]);
                    } else {
                        dp[i][j] = 0; // reset when characters don't match
                    }
                }
            }

            int operations = (lenA - longest) + (lenB - longest);
            System.out.println(operations);
        }
    }
}
