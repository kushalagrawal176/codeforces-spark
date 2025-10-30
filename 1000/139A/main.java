import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int pages = sc.nextInt();
        
        int days[] = new int[7];
        int sum = 0;
        for(int i=0;i<7;i++)
        {
            days[i] = sc.nextInt();
            sum += days[i];
        }
        
        pages = pages % sum;
        if(pages == 0)
            pages = sum;
        
        int ans = 0;
        int i = 0;
        
        for(;i<7;)
        {
            if(pages <= days[i])
            {
                ans = i+1;
                break;
            }

            pages -= days[i];
            i = (i+1)%7;
        }
        
        System.out.println(ans);
    }
}