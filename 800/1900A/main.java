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
            
            int cnt = 0;
            
            for(int i=0;i<n-2;i++)
            {
                if(s.charAt(i) == '.' && s.charAt(i+1) == '.' && s.charAt(i+2) == '.')
                {
                    cnt = 2;
                    break;
                }
            }
            
            if(cnt == 2)    
                System.out.println(cnt);
            else
            {
                for(int i=0;i<n;i++)
                {
                    if(s.charAt(i) == '.')
                        cnt++;
                }
                
                System.out.println(cnt);
            }
        }
    }
}