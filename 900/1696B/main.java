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
            int cnt = 0;
            int curr = 0;
            
            for(int i=0;i<n;i++)
            {
                if(sc.nextInt() == 0)
                {
                    if(curr > 0)
                        cnt++;
                    curr = 0;
                }
                else
                    curr++;
            }

            if(curr > 0)
                cnt++;
                
            System.out.println(Math.min(2,cnt));
        }
    }
}