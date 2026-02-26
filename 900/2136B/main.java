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
            int k = sc.nextInt();
            
            String s = sc.next();
            boolean flag = true;
            
            int one = 0;
            for(int i=0;i<n;i++)
            {
                if(s.charAt(i) == '1')
                    one++;
                else
                    one = 0;

                if(one >= k) // If there are k consecutive 1's then we can't find any permutation
                    flag = false;
            }
            
            if(flag == false)
            {
                System.out.println("NO");
                continue;
            }
            
            System.out.println("YES");

            int high = n; // assigning high values to "0"
            int low = 1; // assigning low values to "1"

            for(int i=0;i<n;i++)
            {
                if(s.charAt(i) == '0')
                    System.out.print(high-- + " ");
                else
                    System.out.print(low++ + " ");
            }
            
            System.out.println();
        }
    }
}