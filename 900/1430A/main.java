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
 
            if(n%3 == 0) 
                System.out.println(n/3+" "+0+" "+0);
            else if(n%5 == 0) 
                System.out.println(0+" "+n/5+" "+0);
            else if(n%7 == 0) 
                System.out.println(0+" "+0+" "+n/7);
            else if((n-5)%3 == 0 && n-5 > 0) 
                System.out.println((n-5)/3+" "+1+" "+0);
            else if((n-7)%3 == 0 && n-7 > 0)
                System.out.println((n-7)/3+" "+0+" "+1);
            else 
                System.out.println(-1);
        }
    }
}