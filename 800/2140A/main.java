import java.util.*;
public class main
{
    public static void main(String[]a)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            String s = sc.next();
            
            int z = 0;
            for(int i=0;i<n;i++)
            {
                if(s.charAt(i) == '0')
                    z++;
            }
            
            int r = 0;
            for(int i=0;i<z;i++)
            {
                if(s.charAt(i) == '1')
                    r++;
            }
            
            System.out.println(r);
        }
    }
}