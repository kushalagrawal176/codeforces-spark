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
            long k = sc.nextLong();
 
            long cnt = 0;
            while(n != 0)
            {
                cnt += n%k;
                n -= n%k;
 
                if(n == 0)
                    break;
 
                n = n/k;
                cnt++;
            }
 
            System.out.println(cnt);
        }
    }
}