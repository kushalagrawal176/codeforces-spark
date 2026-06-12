import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
 
        int zero = 0;
        int five = 0;
 
        while (n-- > 0)
        {
            if(sc.nextInt() == 0)
                zero++;
            else
                five++;
        }
 
        if (zero == 0)
            System.out.println(-1);
        else if (five < 9)
            System.out.println(0);
        else
        {
            while((five-=9) >= 0)
                System.out.print("555555555");
            while(zero-- > 0)
                System.out.print(0);
 
            System.out.println();
        }
    }
}