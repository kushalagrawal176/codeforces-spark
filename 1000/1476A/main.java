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
            int k = sc.nextInt();

            int a = n / k;
            if (n % k != 0)
                a += 1;

            int sum = a * k;

            if (sum % n == 0)
                System.out.println(sum / n);
            else
                System.out.println(sum / n + 1);
        }
    }
}
