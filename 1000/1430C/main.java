import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0)
        {
            int n = sc.nextInt();

            // answer will always be 2
            System.out.println(2);
            int a = n;
            int b = n-1;

            // Generate pairs
            for(int i=1;i<n;i++)
            {
                System.out.println(a + " " + b);
                a = (int)Math.ceil((a+b)/2.0);
                b = n-1-i;
            }
        }
    }
}