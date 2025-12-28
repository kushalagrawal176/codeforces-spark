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
            int cnt = 0;
            int one = 0;
            int o = 0;
            
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i) == '1')
                    one++;
            }
            
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i) == '1')
                {
                    o++;
                    one--;
                }
                else
                {
                    if(one > 0 && o > 0)
                        cnt++;
                }
            }
            
            System.out.println(cnt);
        }
    }
}