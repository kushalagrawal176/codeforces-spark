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
            
            StringBuilder  ans = new StringBuilder();
            
            int i=0;
            for(;i<n-3;i++)
            {
                char ch1 = s.charAt(i);
                char ch2 = s.charAt(i+1);
                char ch3 = s.charAt(i+2);
                char ch4 = s.charAt(i+3);
                
                ans.append(ch1);
                ans.append(ch2);
                
                i += 1;
                
                if(ch4 != 'a' && ch4 != 'e')
                {
                    ans.append(ch3);
                    i++;
                }
                
                ans.append(".");
            }
            
            for(;i<n;i++)
                ans.append(s.charAt(i));
            
            System.out.println(ans);
        }
    }
}