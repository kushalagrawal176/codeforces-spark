import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            long sum = 0;
            
            while(n != 1)
            {
                sum = sum + n;
                n = n/2;
            }
            
            sum++;
            System.out.println(sum);
        }
    }
}