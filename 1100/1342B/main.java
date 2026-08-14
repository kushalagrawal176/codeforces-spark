import java.util.*;
public class main
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while(t-- > 0) 
        {
            String a = sc.next();
 
            boolean allSame = true;
            for(int i=1; i<a.length(); i++)
            {
                if(a.charAt(i) != a.charAt(0))
                {
                    allSame = false;
                    break;
                }
            }
 
            if(allSame)
                System.out.println(a);
            else 
            {
                StringBuilder s = new StringBuilder();
                for(int i = 0; i < a.length(); i++)
                    s.append("01");
                System.out.println(s.toString());
            }
        }
    }
}