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
            int first = Math.abs(sc.nextInt());
            int cnt = 0;
 
            for(int i=1;i<n;i++)
            {
                if(Math.abs(sc.nextInt()) < first)
                    cnt++;
            }
 
            System.out.println(cnt <= n/2 ? "YES" : "NO");
        }
    }
}