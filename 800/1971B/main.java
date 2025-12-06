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
            char[] ch = s.toCharArray();
            
            int i = 0;
            while(i < s.length() && s.charAt(i) == s.charAt(0))
                i++;
            
            if(i == s.length())
                System.out.println("NO");
            else
            {
                char temp = ch[0];
                ch[0] = ch[i];
                ch[i] = temp;
                System.out.println("YES\n"+String.valueOf(ch));
            }
        }
    }
}