import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        int cnt = 0;
        
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
                cnt++;
        }
        
        if(cnt <= s.length()-cnt)
        {
            s = s.toLowerCase();
        }
        else
        {
            s = s.toUpperCase();
        }
        
        System.out.println(s);
    }
}