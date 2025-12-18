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
            
            int l = sc.nextInt();
            String a = sc.next();
            String b = sc.next();
            
            for(int i=0;i<l;i++)
            {
                if(b.charAt(i) == 'V')
                    s = a.charAt(i) + s;
                else
                    s = s + a.charAt(i);
            }
            
            System.out.println(s);
        }
    }
}