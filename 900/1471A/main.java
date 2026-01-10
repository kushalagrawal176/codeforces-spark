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
            int x = sc.nextInt();
            
            long sum1 = 0;
            long sum2 = 0;
            
            for(int i=0;i<n;i++)
            {
                int a = sc.nextInt();
                sum1 += a;
                
                sum2 += a/x;
                if(a%x != 0)
                    sum2++;
            }
 
            if(sum1%x != 0)
                sum1 = sum1/x + 1;
            else
                sum1 = sum1/x;
            
            System.out.println(sum1+" "+sum2);
        }
    }
}