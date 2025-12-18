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
            
            int cnt = 0;
            
            int i = 0;
            while(i < n)
            {
                if(s.charAt(i) == 'B')
                {
                    cnt++;
                    i += k;
                }
                else
                    i++;
            }
            
            System.out.println(cnt);
        }
    }
}