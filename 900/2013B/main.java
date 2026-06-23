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
            long sum = 0;

            for(int i=0;i<n-2;i++)
                sum += sc.nextInt();

            sum = sc.nextInt() - sum;
            sum = sc.nextInt() - sum;

            System.out.println(sum);
        }
    }
}