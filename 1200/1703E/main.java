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
            String s[] = new String[n];
            
            for(int i=0;i<n;i++)
                s[i] = sc.next();
            
            int cnt = 0;
            for(int i=0;i<(n+1)/2;i++)
            {
                for(int j=0;j<n/2;j++)
                {
                    int one = 0;
                    
                    one += s[i].charAt(j)-'0';
                    one += s[j].charAt(n-1-i)-'0';
                    one += s[n-1-j].charAt(i)-'0';
                    one += s[n-1-i].charAt(n-1-j)-'0';
                    
                    cnt += Math.min(one, 4-one);
                }
            }
            
            System.out.println(cnt);
        }
    }
}