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
            String s = sc.next();
            
            long cnt = 0;
            int freq[] = new int[26];
            
            for(int i=0;i<n;i++)
            {
                if(freq[s.charAt(i)-'a'] > 0)
                    continue;
                
                freq[s.charAt(i)-'a'] = 1;
                cnt += n-i;
            }
            
            System.out.println(cnt);
        }
    }
}