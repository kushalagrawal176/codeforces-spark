import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0)
        {
            String r = sc.next();
            long n = r.length();
 
            if(r.length() > 1)
                r = r+r;
 
            long c = 0;
            long m = 0;
            boolean f = false;
 
            for(int i=0;i<r.length();i++)
            {
                if(r.charAt(i) == '0')
                    f = true;
 
                if(r.charAt(i) == '1')
                    c++;
                else
                {
                    m = Math.max(c, m);
                    c = 0;
                }
            }
 
            long x = n*n;
            if(!f)
                System.out.println(x);
            else
            {
                long a = m/2;
                long z = (m-a)*(1+a);
                System.out.println(z);
            }
        }
    }
}