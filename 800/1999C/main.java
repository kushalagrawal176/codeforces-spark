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
            int m = sc.nextInt();
            
            Boolean flag = false;
            
            int l = sc.nextInt();
            int r = sc.nextInt();
            int prev_r = r;
            
            if(l >= s)
                flag = true;
                
            for(int i=1;i<n;i++)
            {
                l = sc.nextInt();
                r = sc.nextInt();
                
                if(l - prev_r >= s)
                    flag = true;
                
                prev_r = r;
            }
            
            if(m - r >= s)
                flag = true;
            
            if(flag == true)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}