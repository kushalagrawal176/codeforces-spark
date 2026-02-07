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

            int maxi = Integer.MIN_VALUE;
            for (int i = 1; i <= n; i++) 
            {
                int a = sc.nextInt();
                maxi = Math.max(maxi, a);
            }

            System.out.println((long) maxi * n);
        }
    }
}
