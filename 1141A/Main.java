import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        // Standard Input
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        // n to be transformed to m

        if(m%n != 0)
            System.out.println("-1");
        else
        {
            // n * factor = m => factor = m/n
            int factor = m/n;

            int cnt = 0;
            while(factor > 1)
            {
                int check = factor;
                if(factor%3 == 0)
                {
                    cnt++;
                    factor = factor/3;
                }
                if(factor%2 == 0)
                {
                    cnt++;
                    factor = factor/2;
                }

                if(check == factor)
                {
                    // if factor is not divisible by 2 or 3 then return -1
                    cnt = -1;
                    break;
                }
            }

            System.out.println(cnt);
        }
    }
}