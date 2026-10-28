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
 
            while(s.contains("?") && (s.contains("R") || s.contains("B"))) 
            {
                s = s.replace("?R?", "BRB");
                s = s.replace("?B?", "RBR");
                s = s.replace("?B", "RB");
                s = s.replace("B?", "BR");
                s = s.replace("?R", "BR");
                s = s.replace("R?", "RB");
            }
 
            s = s.replace("??","BR");
            s = s.replace("?","B");
 
            System.out.println(s);
        }
    }
}