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
            long c = sc.nextLong();

            long f = -1;
            long s = -1;

			if(a < c)
				f = 1;
			if(b*a > c)
				s = b;

			System.out.println(f + " " + s);
        }
    }
}