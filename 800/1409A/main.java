import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t>0)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            if(Math.abs(a-b)%10 != 0)
                System.out.println(Math.abs(a-b)/10 + 1);
            else
                System.out.println(Math.abs(a-b)/10 );
                
            t--;
        }
    }
}