import java.util.*;
public class main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases
        
        while(t-- > 0)
        {
            int n = sc.nextInt(); // length of the array
            int[] a = new int[n]; // array representing jump lengths
            
            // read the array elements
            for(int i = 0; i < n; i++) 
                a[i] = sc.nextInt();
                
            long[] dp = new long[n]; // dp[i] stores max score starting from index i
            long max = 0;            // track the maximum score achievable
            
            // process from right to left (reverse order)
            for(int i = n - 1; i >= 0; i--)
            {
                dp[i] = a[i]; // base score: value at current index
                int j = i + a[i]; // next index after making the jump
                
                // if jump stays within bounds, add the score from that position
                if(j < n)
                    dp[i] += dp[j];

                // update global maximum score
                max = Math.max(max, dp[i]);
            }
            
            // print the maximum score for this test case
            System.out.println(max);
        }
    }
}
