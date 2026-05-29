import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0)
        {
            long a = sc.nextLong();
            long b = sc.nextLong();

            long cnt = 0;

            if(a > b)
            {
                long temp = b;
                b = a;
                a = temp;
            }

            while(a < b)
            {
                a<<=1;
                cnt++;
            }

            if(a > b)
                System.out.println(-1);
            else
                System.out.println((cnt+2)/3);
        }
    }
}