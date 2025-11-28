import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t>0)
        {
            String s = sc.next();
            
            String a = "codeforces";
            int cnt = 0;
            
            for(int i=0;i<10;i++)
                if(s.charAt(i) != a.charAt(i)) cnt++;
            
            System.out.println(cnt);
            t--;
        }
    }
}