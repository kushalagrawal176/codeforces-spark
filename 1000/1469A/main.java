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
 
            String ans = "YES";
            if((s.length()-2)%2 == 1)
                ans = "NO";
            else if(s.charAt(0) == ')' || s.charAt(s.length()-1) == '(')
                ans = "NO";
            
            System.out.println(ans);
        }
    }
}