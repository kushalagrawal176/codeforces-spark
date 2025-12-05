import java.util.*;

public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt(); // number of test cases
        
        while (t-- > 0) 
        {
            int x = sc.nextInt(); // input number
            
            int mini = Integer.MAX_VALUE; // initialize minimum digit
            
            // extract digits one by one
            while (x != 0) 
            {
                mini = Math.min(mini, x % 10); // update minimum digit
                x = x / 10; // remove last digit
            }
            
            System.out.println(mini); // print smallest digit
        }
    }
}
