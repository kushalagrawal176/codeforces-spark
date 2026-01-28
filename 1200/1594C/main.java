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
            char ch = sc.next().charAt(0);
            
            String s = sc.next();
            
            int x = 0;
            int op = 0;
            for(int i=0;i<n;i++)
            {
                if(s.charAt(i) == ch)
                {
                    op++;
                    x = i+1;
                }
            }
            
            if(op == n)
                System.out.println(0);
            else if(x > n/2)
                System.out.println("1\n"+x);
            else
                System.out.println("2\n"+n+" "+(n-1));
        }
    }
}