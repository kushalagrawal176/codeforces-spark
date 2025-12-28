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
            
            int n = a.length();
            boolean flag = false;
            
            for(int i=0;i<n;i++)
            {
                if(a.charAt(i) == b.charAt(0))
                {
                    if((i&1) == 0 && ((n-i-1)&1) == 0)
                    {
                        flag = true;
                        break;
                    }
                }
            }
            
            if(flag == true)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}