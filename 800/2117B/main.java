import java.util.*;

public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();  // number of test cases

        while (t-- > 0) 
        {
            int n = sc.nextInt();

            int[] ans = new int[n];
            int c = 1;

            // Fill symmetric positions
            for (int i = 0; i < n / 2; i++) 
            {
                ans[i] = c;
                ans[n - i - 1] = c + 1;
                c++;
                c++;
            }

            // If n is odd, set the middle element
            if ((n & 1) == 1)
                ans[n / 2] = n;

            // Print the array
            for (int i = 0; i < n; i++) 
                System.out.print(ans[i] + " ");
            
            System.out.println();
        }
    }
}
