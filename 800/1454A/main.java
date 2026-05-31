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

            for(int i=1;i<=n;i++)
            {
                // For odd n, the middle element (n/2+1) should be placed at the end, 
                // and the last element (n) should be placed at the middle.
                // For even n, the elements should be reversed.

                if((n&1) == 1 && i == n/2+1)
                   System.out.print(1+" ");
                else if((n&1) == 1 && i == n)
                    System.out.print(n/2+1 + " ");
                else
                    System.out.print(n-i+1+ " ");
            }

            System.out.println();
        }
    }
}