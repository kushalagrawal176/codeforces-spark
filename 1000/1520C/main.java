import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            
            if(n == 2)
                System.out.println("-1");
            else
            {
                int cnt = 0;
                for(int i=1;i<=n*n;i+=2)
                {
                    System.out.print(i+" ");
                    cnt++;
                    
                    if(cnt%n == 0)
                        System.out.println();
                }
                    
                for(int i=2;i<=n*n;i+=2)
                {
                    System.out.print(i+" ");
                    cnt++;
                    
                    if(cnt%n == 0)
                        System.out.println();
                }
            }
        }
    }
}