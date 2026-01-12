import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        while(n-- > 0)
        {
            String s = sc.next();
            String t = sc.next();
            
            int freq[] = new int[26];
            for(int i=0;i<t.length();i++)
                freq[t.charAt(i)-'A']++;
            
            String ans = "";
            for(int i=s.length()-1;i>=0;i--)
            {
                if(freq[s.charAt(i)-'A'] > 0)
                {
                    ans += s.charAt(i);
                    freq[s.charAt(i)-'A']--;
                }
            }
            
            StringBuffer sb = new StringBuffer(ans);
            sb.reverse();
            String temp = sb.toString();
            
            if(temp.equals(t))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}