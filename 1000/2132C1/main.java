import java.util.*;
public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0)
        {
            long coins = 0;

            long n = sc.nextInt();

            int count = 19;
            while(n != 0) 
            {
                long num = (long)Math.pow(3, count);
                if(n >= num) 
                {
                    coins += (Math.pow(3, count+1)+count*Math.pow(3, count-1));
                    n -= num;
                }
                else 
                    count--;
            }

            System.out.println(coins);
        }
    }
}