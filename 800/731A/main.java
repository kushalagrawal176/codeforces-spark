import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        int cnt = 0;
        char ch = 'a';
        for(int i=0;i<s.length();i++)
        {
            cnt +=Math.min((s.charAt(i)-ch+26)%26, (ch-s.charAt(i)+26)%26);
            ch = s.charAt(i);
        }
        
        System.out.println(cnt);
    }
}