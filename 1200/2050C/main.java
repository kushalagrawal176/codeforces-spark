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
            
            long sum = 0;
            int two = 0;
            int three = 0;
            
            for(int i=0;i<s.length();i++)
            {
                int a = s.charAt(i) - '0';
                sum += a;
                
                if(a == 2)
                    two++;
                if(a == 3)
                    three++;
            }
            
            boolean flag = false;
            
            if(sum%9 == 0)
                flag = true;
            else
            {
                int left = 9 - (int)(sum%9);
 
                if((left&1) == 1)
                    left += 9;
 
                left -= 6*Math.min(three, left/6);
 
                if(left == 0)
                    flag = true;
                else
                {
                    left -= 2*Math.min(two, left/2);
                    
                    if(left == 0)
                        flag = true;
                    else
                        flag = false;
                }
            }
            
            if(flag == true)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}