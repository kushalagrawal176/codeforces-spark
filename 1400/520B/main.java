import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int a = 0;
        while(n < m)
        {
            a++;
            if(m%2 == 1)
                m++;
            else
                m = m/2;
        }
        
        System.out.println(a+n-m);
    }
}