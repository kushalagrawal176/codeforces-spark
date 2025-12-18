import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        String s = sc.next();
        
        int ch[] = new int[26];
        for(int i=0;i<k;i++)
            ch[sc.next().charAt(0)-'a']++;
        
        long sum = 0;
        long ans = 0;
        
        for(int i=0;i<n;i++)
        {
            if(ch[s.charAt(i)-'a'] > 0)
                sum++;
            else
            {
                ans += (sum*(sum+1))/2;
                sum = 0;
            }
        }
        
        System.out.println(ans + (sum*(sum+1))/2);
    }
}