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
            String r = sc.next();
 
            int o = 0;
            int e = 0;
 
            for(int i=0;i<n;i++)
            {
                int d = r.charAt(i)-'0';
                if(i%2 == 0)
                {
                    if(d%2 == 1)
                        o++;
                }
                else
                {
                    if(d%2 == 0)
                        e++;
                }
            }
 
            if(n%2 == 1)
            {
                if(o > 0)
                    System.out.println(1);
                else
                    System.out.println(2);
            }
            else
            {
                if(e > 0)
                    System.out.println(2);
                else
                    System.out.println(1);
            }
        }
    }
}