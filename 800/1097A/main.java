import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        String ans = "NO";

        for(int i=0;i<5;i++)
        {
            String a = sc.next();
            
            if(a.charAt(0) == s.charAt(0) || a.charAt(1) == s.charAt(1))
                ans = "YES";
        }
        
        System.out.println(ans);
    }
}