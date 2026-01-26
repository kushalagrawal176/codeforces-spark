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
            
            if(n == 1)
                System.out.println("FastestFinger");
            else if(n == 2)
                System.out.println("Ashishgup");
            else if(n%2 == 1)
                System.out.println("Ashishgup");
            else
            {
                int cnt_odd = 0;
                int cnt_2 = 0;
                
                for(int i=2; i<=Math.sqrt(n);i++)
                {
                    if(n%i == 0)
                    {
                        while(n%i == 0)
                        {
                            n = n/i;
                            if(i == 2)
                                cnt_2++;
                            else
                                cnt_odd++;
                        }
                    }
                }
                
                if(n == 2)
                    cnt_2++;
                if(n > 2)
                    cnt_odd++;
                
                if(cnt_2 > 1)
                {
                    if(cnt_odd > 0)
                        System.out.println("Ashishgup");
                    else
                        System.out.println("FastestFinger");
                }
                else
                {
                    if(cnt_odd > 1)
                        System.out.println("Ashishgup");
                    else
                        System.out.println("FastestFinger");
                }
            }
        }
    }
}