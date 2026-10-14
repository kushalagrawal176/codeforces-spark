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
 
            int count = 0;
            for(char ch : s.toCharArray())
            {
                if(ch == '1')
                    count++;
            }
 
            System.out.println(count%2 == 0 ? count==2 && s.contains("11") ? "NO" : "YES" : "NO");
        }
    }
}