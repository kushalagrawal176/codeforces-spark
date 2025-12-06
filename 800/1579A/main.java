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
            int cnt_b = 0;
            
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i) == 'A' || s.charAt(i) == 'C')
                    cnt++;
                else
                    cnt_b++;
            }
            
            if(cnt_b == cnt)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}