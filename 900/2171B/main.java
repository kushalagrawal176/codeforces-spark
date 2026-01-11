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

            // Replace middle -1 values with 0
            for (int i = 1; i < n - 1; i++) 
            {
                if (a[i] == -1) 
                    a[i] = 0;
            }

            // Handle first and last elements
            if (a[0] == -1 && a[n - 1] == -1) 
            {
                a[0] = 0;
                a[n - 1] = 0;
            } 
            else if (a[0] == -1)
                a[0] = a[n - 1];
            else if (a[n - 1] == -1)
                a[n - 1] = a[0];

            // Print absolute difference
            System.out.println(Math.abs(a[n - 1] - a[0]));

            // Print modified array
            for (int i = 0; i < n; i++) 
                System.out.print(a[i] + " ");
            
            System.out.println();
        }
    }
}
