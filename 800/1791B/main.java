import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t>0)
        {
            int n = sc.nextInt();
            String s = sc.next();
            
            int x = 0;
            int y = 0;
            
            Boolean flag = false;
            
            for(int i=0;i<n;i++)
            {
                if(s.charAt(i) == 'L')
                    x--;
                else if(s.charAt(i) == 'R')
                    x++;
                else if(s.charAt(i) == 'D')
                    y--;
                else
                    y++;
                    
                if(x == 1 && y == 1)
                {
                    flag = true;
                    break;
                }
            }
            
            if(flag)
                System.out.println("YES");
            else
                System.out.println("NO");
            t--;
        }
    }
}