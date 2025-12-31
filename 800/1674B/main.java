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
            
            int val = (s.charAt(0)-'a')*25+(s.charAt(1)-'a');
            
            if(s.charAt(1) < s.charAt(0))
                val++;
            
            System.out.println(val);
        }
    }
}
