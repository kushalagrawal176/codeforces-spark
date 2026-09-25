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
            int a = sc.nextInt();
            int b = sc.nextInt();
    
            String s = sc.next();
 
            int x = 0, y = 0;
            String ans = "NO";
    
            for(int i=0;i<300;i++)
            {
                char ch = s.charAt(i%n);
 
                if(ch == 'N') 
                    y++;
                if(ch == 'E') 
                    x++;
                if(ch == 'W') 
                    x--;
                if(ch == 'S') 
                    y--;
                if(x==a && y==b)
                    ans="YES";
            }
    
            System.out.println(ans);
        }
    }
}