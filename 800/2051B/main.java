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
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();

            long days = (n / (a + b + c)) * 3;
            long cnt = 0;

            while (cnt < n % (a + b + c)) 
            {
                days++;
                cnt += a;

                if (cnt < n % (a + b + c)) 
                {
                    days++;
                    cnt += b;
                } 
                else
                    break;

                if (cnt < n % (a + b + c)) 
                {
                    days++;
                    cnt += c;
                }
            }

            System.out.println(days);
        }
    }
}
