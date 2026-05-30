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

            int ans = 0;

            if(a == b)
                ans = 0;
            else if(a < b)
            {
                if((a&1) != (b&1))
                    ans = 1;
                else
                    ans = 2;
            }
            else
            {
                if((a&1) != (b&1))
                    ans = 2;
                else
                    ans = 1;
            }

            System.out.println(ans);
        }
    }
}