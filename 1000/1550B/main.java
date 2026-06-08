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
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            String s = sc.next();
            
            if(b >= 0)
                System.out.println(a*n + b*n);
            else
            {
                int cnt = 1;
 
                for(int i=1;i<n;i++)
                {
                    if(s.charAt(i) != s.charAt(i-1))
                        cnt++;
                }
                
                cnt = cnt/2+1;
                System.out.println(Math.max(a*n + b*cnt, (a+b)*n));
            }
        }
    }
}