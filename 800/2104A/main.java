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
            
            if((a+b+c)%3 != 0)
                System.out.println("NO");
            else
            {
                int avg = (a+b+c)/3;
                
                if(a > avg || b > avg)
                    System.out.println("NO");
                else
                    System.out.println("YES");
            }
        }
    }
}