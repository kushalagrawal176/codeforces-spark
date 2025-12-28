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
            
            String a = "";
            int ptr = 0;
            int i = 1;
            
            while(i < n)
            {
                if(s.charAt(i) == s.charAt(ptr))
                {
                    a += s.charAt(i);
                    ptr = i+1;
                    i++;
                }
                i++;
            }
            
            System.out.println(a);
        }
    }
}