import java.util.*;

public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();  // number of test cases
        
        while (t-- > 0) 
        {
            // Each test case has 64 characters (8x8 grid)
            for (int i = 0; i < 8; i++) 
            {
                String s = sc.next();
                for(int j=0;j<8;j++)
                {
                    if (s.charAt(j) != '.' && s.charAt(j) != '\n') 
                    {
                        System.out.print(s.charAt(j));
                    }
                }
            }
            
            System.out.println();
        }
    }
}
