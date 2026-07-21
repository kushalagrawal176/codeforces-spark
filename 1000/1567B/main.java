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
 
            int xor = 0;

            // Calculate the XOR value for the range
            // XOR prefix sum from 0 to a-1
            if ((a - 1) % 4 == 0) 
                xor = a - 1;
            else if ((a - 1) % 4 == 1) 
                xor = 1;
            else if ((a - 1) % 4 == 2) 
                xor = a;

            // Determine the output based on the XOR values
            if (xor == b) 
                System.out.println(a);
            else if ((xor ^ a) == b) 
                System.out.println(a + 2);
            else 
                System.out.println(a + 1);
        }
    }
}
