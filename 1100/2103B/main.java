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
            String s = sc.next();
 
            int change = 0;
            
            if(s.charAt(0) == '1')
                change++;
 
            for(int i=1;i<n;i++)
            {
                if(s.charAt(i) != s.charAt(i-1))
                    change++;
            }
            
            if(change == 2)
                change = 1;
            if(change > 2)
                change -= 2;
 
            System.out.println(n+change);
        }
    }
}