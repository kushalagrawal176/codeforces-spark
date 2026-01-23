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
            int a = -1;
            int b = -1;
            int c = -1;
            
            int cnt = 0;
            
            for(int i=2;i*i<n;i++)
            {
                if(cnt >= 2)
                    break;
                if(n%i == 0)
                {
                    if(cnt == 0)
                        a = i;
                    else if(cnt == 1)
                        b = i;
                    else
                    {}
                    
                    cnt++;
                    n = n/i;
                }
            }
            
            if(cnt < 2)
                System.out.println("NO");
            else
                System.out.println("YES"+"\n"+a+" "+b+" "+n);
        }
    }
}