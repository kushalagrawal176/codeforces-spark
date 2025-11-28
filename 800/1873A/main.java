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
            if(s.charAt(0) != 'a')
                cnt++;
            if(s.charAt(1) != 'b')
                cnt++;
            if(s.charAt(2) != 'c')
                cnt++;
            
            if(cnt <= 2)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}