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
            
            int odd = 0;
            
            for(int i=0;i<n;i++)
            {
                int a = sc.nextInt();
                if((a&1) == 1)
                    odd++;
            }
            
            if(odd == 0 || (x == n && odd%2 == 0) || (odd == n && x%2 == 0))
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}