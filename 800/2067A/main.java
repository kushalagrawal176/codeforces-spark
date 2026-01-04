import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            int d = x+1-y;
            
            if(d>=0 && d%9 == 0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}