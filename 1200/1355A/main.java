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
            long k = sc.nextLong()-1;
            
            while(k-- > 0)
            {
                int mini = 9;
                int maxi = 0;
                
                long temp = a;
                while(temp != 0)
                {
                    mini = Math.min(mini, (int)(temp%10));
                    maxi = Math.max(maxi, (int)(temp%10));
                    
                    temp = temp/10;
                }
                
                if(mini == 0 || maxi == 0)
                    break;
                a += (mini*maxi);
            }
            
            System.out.println(a);
        }
    }
}