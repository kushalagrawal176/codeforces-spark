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
            String b = sc.next();
            
            String a1 = a;
            String b1 = b;
            
            while(a.equals(b) == false)
            {
                if(a.length() > b.length())
                    b = b + b1;
                else if(b.length() > a.length())
                    a = a + a1;
                else
                    break;
            }
            
            if(a.equals(b) == true)
                System.out.println(a);
            else
                System.out.println("-1");
        }
    }
}