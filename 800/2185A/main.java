import java.util.*;
public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // number of test cases
        
        while (t-- > 0) 
        {
            int n = sc.nextInt();  // input number
            
            for (int i = 1; i <= n; i++)
                System.out.print(i + " ");
            System.out.println();
        }
    }
}
