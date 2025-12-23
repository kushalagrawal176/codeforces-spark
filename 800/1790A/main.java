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
            String pi = "314159265358979323846264338327";
            
            int cnt = 0;
            int i = 0;
            
            while(i<s.length())
            {
                if(s.charAt(i) != pi.charAt(i))
                    break;
                cnt++;
                i++;
            }
            
            System.out.println(cnt);
        }
    }
}