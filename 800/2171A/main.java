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

            if (n % 2 == 1) 
            {
                System.out.println(0);
                continue;
            }

            int cnt = 0;

            if (n % 2 == 0)
                cnt++;
            if (n % 4 == 0)
                cnt++;

            for (int i = 6; i <= n; i += 2) 
            {
                if (i % 2 == 0 && (n - i) % 4 == 0)
                    cnt++;
            }

            System.out.println(cnt);
        }
    }
}
