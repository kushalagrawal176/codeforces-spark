import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t>0)
        {
            int k = sc.nextInt();
            
            int i = 1;
            for(int j=2;j<=k;j++)
            {
                i++;
                if(i%3 == 0 || i%10 == 3)
                {
                    while(i%3 == 0 || i%10 == 3)
                        i++;
                }
            }
            System.out.println(i);
            
            t--;
        }
    }
}