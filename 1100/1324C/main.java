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
            int maxi = -1;
            
            int prev = 0;
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i) == 'R')
                {
                    if(maxi == -1)
                        maxi = Math.max(maxi, i+1);
                    else
                        maxi = Math.max(maxi, i-prev);
                    prev = i;
                }
            }
            
            maxi = Math.max(maxi, s.length()-prev);
            
            if(prev == 0 && s.charAt(0) == 'L')
                maxi = s.length()+1;
            System.out.println(maxi);
        }
    }
}