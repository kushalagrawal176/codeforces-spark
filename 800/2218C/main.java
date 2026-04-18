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

            int[] a = new int[3 * n];
            Arrays.fill(a, -1);

            int ptr = 3 * n;

            // First loop: fill positions i and i-1
            for (int i = 3 * n - 1; i >= 0; i -= 3) 
            {
                a[i] = ptr;
                a[i - 1] = ptr - 1;
                ptr -= 2;
            }

            // Second loop: fill positions i
            for (int i = 3 * n - 3; i >= 0; i -= 3) 
            {
                a[i] = ptr;
                ptr--;
            }

            // Print result
            for (int i = 0; i < 3 * n; i++)
                System.out.print(a[i] + " ");

            System.out.println();
        }
    }
}
