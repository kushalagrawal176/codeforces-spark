import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String s = sc.next();
        
        int cnt = 0;
        int x = 0;
        
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i) == 'x')
                x++;
            else
            {
                if(x >= 2)
                    cnt += x-2;
                x = 0;
            }
        }
        
        if(x >= 2)
            cnt += x-2;
        
        System.out.println(cnt);
    }
}