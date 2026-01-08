import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int cnt = 0;
        
        for(int i=2;i<=n;i++)
        {
            int j = i;
            int k = 0;
            int d = 2;
            
            while(j > 1)
            {
                if(j%d == 0)
                {
                    k++;
                    j = j/d;
                    while(j%d == 0)
                    {
                        j = j/d;
                    }
                }
                
                d++;
            }
            
            if(k == 2)
                cnt++;
        }
        
        System.out.println(cnt);
    }
}