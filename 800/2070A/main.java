import java.util.*;

public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) 
        {
            long n = sc.nextLong();
            long ans = 0;

            ans = ans + (n / 15) * 3 + 1;
            n = n - 15 * (n / 15);

            if (n == 0) 
            {
                // do nothing
            } 
            else if (n == 1)
                ans = ans + 1;
            else 
                ans = ans + 2;

            System.out.println(ans);
        }
    }
}
