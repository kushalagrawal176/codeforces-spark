import java.util.*;

public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        // Read number of test cases
        int t = sc.nextInt();
        
        // Process each test case
        while(t-- > 0)
        {
            // Read the number of sticks (a) and diamonds (b)
            long a = sc.nextLong();
            long b = sc.nextLong();
            
            /*
             Problem statement:
             - You can craft either a shovel (requires 2 sticks + 1 diamond)
               or a sword (requires 1 stick + 2 diamonds).
             - Goal: maximize the total number of tools crafted.
             
             Key observation:
             - Each tool consumes exactly 3 resources in total.
             - So the maximum number of tools possible is limited by:
               1. The smaller of a and b (since one resource may run out first).
               2. The total resources divided by 3 ((a+b)/3).
               
             Therefore, the answer is min(a, b, (a+b)/3).
            */
            
            System.out.println(Math.min(a, Math.min(b, (a+b)/3)));
        }
    }
}
