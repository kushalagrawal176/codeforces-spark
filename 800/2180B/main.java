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
            
            for(int i=1;i<n;i++)
            {
                String a = sc.next();
                
                if((s+a).compareTo(a+s) > 0)
                    s = a + s;
                else
                    s = s + a;
            }
            
            System.out.println(s);
        }
    }
}