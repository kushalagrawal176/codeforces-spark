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
            int s = sc.nextInt();
            
            int sum = 0;
            
            int zero = 0;
            int one = 0;
            int two = 0;
            
            for(int i=0;i<n;i++)
            {
                int a = sc.nextInt();
                
                if(a == 0)
                    zero++;
                else if(a == 1)
                    one++;
                else
                    two++;
                
                sum += a;
            }
            
            s -= sum;
            
            if(s == 0 || s > 1)
                System.out.println("-1");
            else
            {
                while(zero-- > 0)
                    System.out.print("0 ");
                while(two-- > 0)
                    System.out.print("2 ");
                while(one-- > 0)
                    System.out.print("1 ");
                    
                System.out.println();
            }
        }
    }
}