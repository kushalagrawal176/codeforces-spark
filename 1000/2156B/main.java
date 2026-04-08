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
            int q = sc.nextInt();
 
            String s = sc.next();
 
            while(q-- > 0)
            {
                int a = sc.nextInt();
 
                long sec = 0;
                int idx = 0;
 
                if(s.contains("B"))
                {
                    while(a != 0)
                    {
                        sec++;
 
                        if(s.charAt(idx) == 'A')
                            a--;
                        else
                            a = a/2;
 
                        idx = (idx+1)%n;
                    }
                }
                else
                    sec = a;
 
                System.out.println(sec);
            }
        }
    }
}