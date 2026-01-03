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
            
            if(n == 3 || n == 2 || n == 4)
                System.out.println("Bob");
            else
                System.out.println("Alice");
        }
    }
}