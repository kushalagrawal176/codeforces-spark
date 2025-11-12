import java.util.*;

public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) 
        {
            String n = sc.next();
            
            if (n.length() > 10) 
            {
                int len = n.length() - 2;
                char a = n.charAt(0);
                char b = n.charAt(n.length() - 1);
                
                // Construct the shortened word
                String shortened = "" + a + len + b;
                System.out.println(shortened);
            } 
            else 
            {
                System.out.println(n);
            }
        }
    }
}
