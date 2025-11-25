import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t>0)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            
            int cnt = 0;
            if(a<b)
                cnt++;
            if(a<c)
                cnt++;
            if(a<d)
                cnt++;
                
            System.out.println(cnt);
            
            t--;
        }
    }
}