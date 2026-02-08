import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            long s = sc.nextLong();
            long k = sc.nextLong();
            long m = sc.nextLong();
            
            if(((m/k)&1) == 1)
                s = Math.min(s, k);
            
            System.out.println(Math.max(0, s-m%k));
        }
    }
}