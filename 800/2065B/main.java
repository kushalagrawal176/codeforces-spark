import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = sc.next();
            
            int ans = s.length();
            for(int i=1;i<s.length();i++)
            {
                if(s.charAt(i) == s.charAt(i-1))
                    ans = 1;
            }
            
            System.out.println(ans);
        }
    }
}