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
            int k = sc.nextInt();
            
            String s = sc.next();
            
            int ans = 1000000;
            int b = 0;
            int w = 0;
            
            int right = 0;
            int left = 0;
            
            while(right < n)
            {
                if(s.charAt(right) == 'B')
                    b++;
                else
                    w++;
                    
                if(b == k)
                {
                    ans = 0;
                    break;
                }
                if(b+w == k)
                {
                    ans = Math.min(ans, w);
                    
                    if(s.charAt(left) == 'B')
                        b--;
                    else
                        w--;
                    
                    left++;
                }
                
                right++;
            }
            
            System.out.println(ans);
        }
    }
}