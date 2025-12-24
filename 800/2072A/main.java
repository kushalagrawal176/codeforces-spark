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
            int p = sc.nextInt();

            int cnt = Math.abs(k) / p;

            if (Math.abs(k) % p != 0)
                cnt++;

            if (cnt <= n)
                System.out.println(cnt);
            else
                System.out.println(-1);
        }
    }
}
