import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int i = 19;
        
        while(k > 0)
        {
            int t = i;
            int sum = 0;
            while(t>0)
            {
                sum += t%10;
                t = t/10;
            }
            
            if(sum == 10)
                k--;
            
            i++;
        }
        
        System.out.println(i-1);
    }
}