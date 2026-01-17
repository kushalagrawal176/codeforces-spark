import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            long a = sc.nextLong();
            boolean flag = false;
            
            for(long i=1;i*i*i<=a;i++)
            {
                if(a-i*i*i <= 0)
                    continue
                else
                {
                    if(Math.cbrt(a-i*i*i) == (long)(Math.cbrt(a-i*i*i)))
                    {
                        flag = true;
                        break;
                    }
                }
            }
            
            if(flag)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}