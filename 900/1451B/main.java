import java.util.*;
public class main 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
 
        while(q-- > 0) 
        {
            int n = sc.nextInt();
            int t = sc.nextInt();
            String s = sc.next();
 
            while(t-- > 0) 
            {
                int l = sc.nextInt() - 1;
                int r = sc.nextInt();
 
                if(s.substring(0, l).indexOf(s.charAt(l)) >= 0 || s.substring(r).indexOf(s.charAt(r - 1)) >= 0)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }
    }
}
