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
            
            int odd = 0;
            int even = 0;
            
            for(int i=0;i<n;i++)
            {
                int a = sc.nextInt();
                if((i&1) == (a&1))
                    continue;
                else if((i&1) == 0)
                    odd++;
                else
                    even++;
            }
            
            if(even == odd)  
                System.out.println(even);
            else
                System.out.println(-1);
        }
    }
}