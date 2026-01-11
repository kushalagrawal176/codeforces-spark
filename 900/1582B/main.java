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
            int one = 0;
            int zero = 0;
            
            for(int i=0;i<n;i++)
            {
                int a = sc.nextInt();
                if(a == 0)
                    zero++;
                if(a == 1)
                    one++;
            }
            
            System.out.println((one*1L*(long)Math.pow(2,zero)));
        }
    }
}