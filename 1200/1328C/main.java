import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases
        
        while(t-- > 0)
        {
            int n = sc.nextInt(); // length of the ternary string
            String s = sc.next(); // input ternary string (digits '0', '1', '2')
            
            String a = ""; // first resulting string
            String b = ""; // second resulting string
            
            boolean flag = false; 
            // flag indicates whether we have already "broken symmetry"
            // i.e., once we assign '1' to 'a' and '0' to 'b' for a '1',
            // from that point onward, 'a' must always be <= 'b'
            
            for(int i=0; i<n; i++)
            {
                char ch = s.charAt(i); // current digit in the ternary string
                
                if(ch == '1')
                {
                    if(flag == true)
                    {
                        // After breaking symmetry, always keep 'a' smaller
                        a = a + '0';
                        b = b + '1';
                    }
                    else
                    {
                        // First time we encounter '1', break symmetry here
                        flag = true;
                        a = a + '1';
                        b = b + '0';
                    }
                }
                else if(ch == '2')
                {
                    if(flag == true)
                    {
                        // After symmetry is broken, give all '2' to 'b'
                        a = a + '0';
                        b = b + '2';
                    }
                    else
                    {
                        // Before symmetry is broken, split '2' evenly
                        a = a + '1';
                        b = b + '1';
                    }
                }
                else // ch == '0'
                {
                    // Both strings get '0' since sum must match original digit
                    a = a + '0';
                    b = b + '0';
                }
            }
            
            // Print the two resulting strings
            System.out.println(a + "\n" + b);
        }
    }
}
