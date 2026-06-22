import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int cnt = 1;
        int c = 1;

        int prev_h = sc.nextInt();
        int prev_m = sc.nextInt();

        n--;
        while(n-- > 0)
        {
            int h = sc.nextInt();
            int m = sc.nextInt();

            if(h - prev_h > 0 || m - prev_m > 0)
                c = 1;
            else
                c++;

            cnt = Math.max(cnt, c);

            prev_h = h;
            prev_m = m;
        }

        System.out.println(cnt);
    }
}