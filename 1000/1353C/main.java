import java.util.*;

public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();  // number of test cases
        while (t-- > 0) 
        {
            long n = sc.nextLong();  // size of the board

            long ans = 0;
            long temp = 8;

            for (int i = 1; i <= n / 2; i++) 
            {
                ans += temp * i;
                temp += 8;
            }

            System.out.println(ans);
        }
    }
}
