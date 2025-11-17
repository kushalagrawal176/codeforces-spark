import java.util.*;

public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();  // number of operations
        int x = 0;             // initial value of variable
        
        while (t-- > 0) 
        {
            String s = sc.next();  // read operation string
            
            if (s.charAt(1) == '+')
                x++;
            else
                x--;
        }
        
        System.out.println(x);
    }
}
