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
            int l = s.length();
            
            for(int i=0;i<s.length()-1;i++)
            {
                if(s.charAt(i) == s.charAt(i+1))
                {
                    char ch = s.charAt(i);
                    ch = (char)((ch-'a'+1)%26 +'a');
                    
                    String s1 = s.substring(0, i+1);
                    s1 = s1 + ch;
                    String s2 = s.substring(i+1);
                    s = s1 + s2;
                    
                    break;
                }
            }
            
            if(l == s.length())
            {
                char ch = s.charAt(0);
                ch = (char)((ch-'a'+1)%26 +'a');
                s = ch + s;
            }
            
            System.out.println(s);
        }
    }
}
