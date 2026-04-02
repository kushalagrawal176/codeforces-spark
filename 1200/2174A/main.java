import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0)
        {
            String a = sc.next();
            String b = sc.next();

            int freq[] = new int[26];
            for(int i=0;i<b.length();i++)
                freq[b.charAt(i)-'a']++;

            boolean flag = true;
            for(int i=0;i<a.length();i++)
            {
                if(freq[a.charAt(i)-'a'] == 0)
                {
                    flag = false;
                    break;
                }

                freq[a.charAt(i)-'a']--;
            }

            if(flag == false)
            {
                System.out.println("Impossible");
                continue;
            }

            String ans = "";
            int ptr = 0;

            for(int i=0;i<26;i++)
            {
                while(ptr < a.length() && (a.charAt(ptr)-'a' <= i))
                {
                    ans += a.charAt(ptr);
                    ptr++;
                }

                while(freq[i] > 0)
                {
                    ans += (char)('a'+i);
                    freq[i]--;
                }
            }

            System.out.println(ans);
        }
    }
}