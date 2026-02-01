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
            
            StringBuilder a = new StringBuilder("");
            int i = 0;
            while(i < n && s.charAt(i) == '0')
            {
                a.append("0");
                i++;
            }
            
            StringBuilder b = new StringBuilder("");
            int j = n-1;
            while(j >=0 && s.charAt(j) == '1')
            {
                b.append("1");
                j--;
            }
                
            if(i < j)
                a.append("0").append(b);
            else
                a.append(b);
            
            System.out.println(a);
        }
    }
}