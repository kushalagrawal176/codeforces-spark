import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0)
        {
            String ans = "NO";

            String s = sc.next();
            int o = 0;

            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i) == '(')
                    o++;
                else
                    o--;
                
                if(o == 0 && i != s.length()-1)
                    ans = "YES";
            }

            System.out.println(ans);
        }
    }
}