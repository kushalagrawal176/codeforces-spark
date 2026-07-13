import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        int cnt = 0;
        
        while(s.length() > 1)
        {
            cnt++;
            long sum = 0;

            for(int i=0;i<s.length();i++)
                sum += s.charAt(i)-'0';
            s = Long.toString(sum);
        }
        
        System.out.println(cnt);
    }
}