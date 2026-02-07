import java.util.*;
public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- > 0) 
        {
            int n = sc.nextInt();
            
            int[] a = new int[n];
            int ptr = 1;
            
            // Fill from the end, skipping every other index
            for (int i = n - 1; i >= 0; i -= 2) 
            {
                a[i] = ptr;
                ptr++;
            }
            
            int i;
            if ((n & 1) == 1)
                i = 1;
            else
                i = 0;
            
            // Fill remaining indices
            for (; i < n; i += 2) 
            {
                a[i] = ptr;
                ptr++;
            }
            
            // Print the permutation
            for (int j = 0; j < n; j++)
                System.out.print(a[j] + " ");
            
            System.out.println();
        }
    }
}
