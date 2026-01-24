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
            int b[] = new int[n+1];
            
            boolean flag = true;
            for(int i=0;i<n;i++)
            {
                int a = sc.nextInt();
                
                while(a > 0)
                {
                    if(a <= n && b[a] == 0)
                        break;
                    
                    a = a/2;
                }
                
                if(a <= 0)
                {
                    flag = false;
                    continue;
                }
                
                if(a <= n)
                {
                    if(b[a] > 0)
                        flag = false;
                    
                    b[a] = 1;
                }
            }
            
            if(flag == true)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}