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
            String x = "", y = "";
 
            x = "(".repeat(s.length()) + ")".repeat(s.length());
            for(int i=0; i<s.length(); i++)
                y += "()";
 
            if(!x.contains(s))      
                System.out.println("YES\n" + x);
            else if(!y.contains(s))     
                System.out.println("YES\n" + y);
            else    
                System.out.println("NO");
        }
    }
}
