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
            int zero = 0;
            int sum = 0;
            
            for(int i=0;i<n;i++)
            {
                int a = sc.nextInt();
                if(a == 0)
                    zero++;
                
                sum += a;
            }
            
            System.out.println(sum+zero);
        }
    }
}