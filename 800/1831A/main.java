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
            String ans = "";
            
            for(int i=1;i<=n;i++)
            {
                int a = sc.nextInt();
                
                ans += (n+1-a) + " ";
            }
            
            System.out.println(ans);
        }
    }
}