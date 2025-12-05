import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            long  a = sc.nextLong();
            long  b = sc.nextLong();
            long  n = sc.nextLong();
            
            long cnt = 0;
            
            while(!(a>n || b>n))
            {
                if(a<b)
                    a = a+b;
                else
                    b = a+b;
                cnt++;
            }
            
            System.out.println(cnt);
        }
    }
}