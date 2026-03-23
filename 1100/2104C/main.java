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
 
            if(s.charAt(0) == s.charAt(n-1))
                System.out.println(s.charAt(0) == 'A' ? "Alice" : "Bob");
            else
            {
                int b = 0;
                for(int i=0;i<n;i++)
                {
                    if(s.charAt(i) == 'B')
                        b++;
                }
                
                if(s.charAt(n-1) == 'A' && s.charAt(n-2) == 'A')
                    System.out.println("Alice");
                else if(b == 1 && s.charAt(n-1) == 'B')
                    System.out.println("Alice");
                else
                    System.out.println("Bob");
            }
        }
    }
}