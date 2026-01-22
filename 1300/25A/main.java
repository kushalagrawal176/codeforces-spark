import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int even = 0;
        int odd = 0;
        int e = -1;
        int o = -1;
        
        for(int i=0;i<n;i++)
        {
            int a = sc.nextInt();
            
            if(a%2 == 0)
            {
                even++;
                e = i+1;
            }
            else
            {
                odd++;
                o = i+1;
            }
        }
        
        if(even == 1)
            System.out.println(e);
        else
            System.out.println(o);
    }
}