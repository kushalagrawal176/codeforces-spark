import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int police = 0;
        int crime = 0;
        int cnt = 0;
        
        for(int i=0;i<n;i++)
        {
            int a = sc.nextInt();
            if(a == -1)
                crime++;
            else
                police += a;
            
            if(crime > police)
            {
                cnt++;
                crime--;
            }
            else if(crime > 0)
            {
                police = police - crime;
                crime = 0;
            }
            else
            {}
        }
        
        System.out.println(cnt);
    }
}