import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int cnt_1 = 0;
        int cnt_2 = 0;
        
        while(t-- > 0)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            if(a > b)
                cnt_1++;
            if(a < b)
                cnt_2++;
        }
        
        if(cnt_1 > cnt_2)
            System.out.println("Mishka");
        else if(cnt_1 < cnt_2)
            System.out.println("Chris");
        else
            System.out.println("Friendship is magic!^^");
    }
}