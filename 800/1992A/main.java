import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            
            for(int i=1;i<=5;i++)
            {
                if(a <= b && a <= c)
                    a++; 
                else if(b <= c && b <= a)
                    b++;
                else 
                    c++;
            }
            
            System.out.println(a*b*c);
        }
    }
}