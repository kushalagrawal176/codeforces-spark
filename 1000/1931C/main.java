import java.util.*;

public class Main 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Read number of test cases

        while (t-- > 0) 
        {
            int n = sc.nextInt(); // Read size of array

            int cnt1 = 0; // Count of non-border elements for first case
            int cnt2 = 0; // Count of non-border elements for second case

            int idx1 = 0; // Start index for counting
            int idx2 = 0; // End index for counting

            int a[] = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt(); // Read array elements

            // Case 1: Remove elements equal to a[0] from both ends
            int i = 0;
            while (i < n && a[i] == a[0])
                i++; // Skip all elements from start equal to a[0]
            idx1 = i;

            i = n - 1;
            while (i >= 0 && a[i] == a[0])
                i--; // Skip all elements from end equal to a[0]
            idx2 = i;

            cnt1 = idx2 - idx1 + 1; // Count remaining elements

            // Case 2: Remove elements equal to a[n-1] from both ends
            i = 0;
            while (i < n && a[i] == a[n - 1])
                i++; // Skip all elements from start equal to a[n-1]
            idx1 = i;

            i = n - 1;
            while (i >= 0 && a[i] == a[n - 1])
                i--; // Skip all elements from end equal to a[n-1]
            idx2 = i;

            cnt2 = idx2 - idx1 + 1; // Count remaining elements

            // If all elements are same, result is 0
            if (Math.abs(Math.min(cnt1, cnt2)) == n)
                System.out.println(0);
            else
                // Print minimum of the two counts
                System.out.println(Math.min(cnt1, cnt2));
        }
    }
}