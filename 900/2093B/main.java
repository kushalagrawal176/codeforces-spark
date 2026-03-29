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
            
            long zero = 0;
            long cnt = 0;
            
            for(int i=s.length()-1;i>=0;i--)
            {
                if(s.charAt(i) == '0' && cnt == 0)
                    zero++;
                if(s.charAt(i) != '0')
                    cnt++;
            }
            
            System.out.println(cnt+zero-1);
        }
    }
}