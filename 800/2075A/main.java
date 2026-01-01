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
            long k = sc.nextLong();

            long cnt = 0;

            // Check if n is odd
            if ((n & 1) == 1) 
            {
                cnt++;
                n = n - k;
                cnt = cnt + n / (k - 1);

                if (n % (k - 1) != 0) 
                    cnt++;
            } 
            else 
            {
                cnt = n / (k - 1);
                if (n % (k - 1) != 0)
                    cnt++;
            }

            System.out.println(cnt);
        }
    }
}
