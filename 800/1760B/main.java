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
            
            char ch = 'a';
            for(int i=0;i<s.length();i++)
            {
                ch = (char)Math.max((int)ch, (int)s.charAt(i));
            }
            
            System.out.println(ch-97+1);
        }
    }
}