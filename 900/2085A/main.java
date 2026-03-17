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
            int k = sc.nextInt();
 
            String s = sc.next();
            String r = "";

            boolean distinct = true;

            for(int i=n-1;i>=0;i--)
            {
                r += s.charAt(i);
                
                if(s.charAt(i) != s.charAt(0))
                    distinct = false;
            }
            
            if(distinct == true)
                System.out.println("NO");
            else if(s.compareTo(r) < 0 || k > 0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}