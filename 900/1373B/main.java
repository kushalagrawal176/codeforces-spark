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
            
            int a = 0;
            
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i) == '0')
                    a++;
            }
            
            int b = s.length()-a;
            
            if(a == b && ((a&1) == 0))
                System.out.println("NET");
            else if(a == b && ((a&1) == 1))
                System.out.println("DA");
            else
            {
                if((Math.min(a,b) & 1) == 0)
                    System.out.println("NET");
                else
                    System.out.println("DA");
            }
        }
    }
}