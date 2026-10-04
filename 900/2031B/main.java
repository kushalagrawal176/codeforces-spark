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
            String s = "YES";
 
            for(int i=1;i<=n;i++)
            {
                int a = sc.nextInt();
                if(Math.abs(a-i) > 1)
                    s = "NO";
            }
 
            System.out.println(s);
        }
    }
}
