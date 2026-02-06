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
            
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();
            
            int ptr = n;
            int i = 0;
            
            // Print prefix where a[i] == ptr decreasing
            while (i < n && ptr == a[i]) 
            {
                System.out.print(a[i] + " ");
                i++;
                ptr--;
            }
            
            int l = i;
            for (; i < n; i++) 
            {
                if (a[i] == ptr)
                    break;
            }
            
            if (i == n) 
            {
                System.out.println();
                continue;
            }
            
            // Print reversed segment
            for (int j = i; j >= l; j--)
                System.out.print(a[j] + " ");
            
            i++;
            
            // Print remaining elements
            for (; i < n; i++)
                System.out.print(a[i] + " ");
            
            System.out.println();
        }
    }
}
