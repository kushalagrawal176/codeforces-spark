import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        long n = sc.nextLong();
        boolean flag = true;
        
        while(n > 0)
        {
            if(n%10 == 1)
                n = n/10;
            else if(n%100 == 14) 
                n = n/100;
            else if(n%1000 == 144)   
                n = n/1000;
            else
            {
                flag = false;
                break;
            }
        }
        
        if(flag)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}