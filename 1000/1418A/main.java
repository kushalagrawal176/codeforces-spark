import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0)
        {
            long x = sc.nextLong();
            long y = sc.nextLong();
            long k = sc.nextLong();

            long ans = ((k*y + k + x - 2 - 1)/(x-1)) + k;

            System.out.println(ans);
        }
    }
}