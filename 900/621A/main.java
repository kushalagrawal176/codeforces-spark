import java.util.*;
public class main
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long odd = 0;
        long min = Long.MAX_VALUE;
        long sum = 0;

        for(int i=0;i<n;i++)
        {
            long num = sc.nextLong();
            if(num%2 == 1)
            {
                odd++;
                min = Math.min(min, num);
            }

            sum += num;
        }

        System.out.println(odd%2==1 ? (sum-min) : sum);
    }
}