import java.util.*;
public class main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        
        while (t-- > 0)
        {
            int n = sc.nextInt();
            char c = sc.next().charAt(0);
            sc.nextLine();
            
            String s = sc.nextLine();
            s = s + s;
            
            int ans = 0;
            int last = 0;
            for(int i=2*n-1;i>=0;i--)
            {
                if(s.charAt(i) == 'g')
                    last = i;
                if(s.charAt(i) == c && last != 0)
                    ans = Math.max(ans, last-i);
            }
            
            System.out.println(ans);
        }
    }
}