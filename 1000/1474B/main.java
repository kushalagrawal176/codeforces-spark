import java.util.*;
public class main
{
    public static boolean prime(int a)
    {
        for(int i=2;i*i<=a;i++)
        {
            if(a%i == 0)
                return false;
        }
        
        return true;
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int d = sc.nextInt();
            
            int num1 = 0;
            int num2 = 0;
            
            int a = d+1;
            while(prime(a) == false)
                a++;
            
            num1 = a;
            
            a = a+d;
            while(prime(a) == false)
                a++;
            
            num2 = a;
            
            System.out.println(num1*num2);
        }
    }
}