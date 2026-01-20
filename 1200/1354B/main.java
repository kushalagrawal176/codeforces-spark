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
            int n = s.length();
            
            int one = 0;
            int two = 0;
            int three = 0;
            
            int left = 0;
            int right = 0;
            
            int len = 200001;
            
            while(right < n)
            {
                if(s.charAt(right) == '1')
                    one++;
                else if(s.charAt(right) == '2')
                    two++;
                else
                    three++;
                
                while(left <= right && one >= 1 && two >= 1 && three >= 1)
                {
                    len = Math.min(len, right-left+1);
                    
                    if(s.charAt(left) == '1')
                        one--;
                    else if(s.charAt(left) ==  '2')
                        two--;
                    else
                        three--;
                        
                    left++;
                }
                
                right++;
            }
            
            if(len == 200001)
                len = 0;
            
            System.out.println(len);
        }
    }
}