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
 
            for(int i=0; i<n; i++) 
            {
                for(int j=0; j<n; j++) 
                    System.out.print((i==j || (i+1)%n==j ? 1 : 0) + " ");
 
                System.out.println();
            }
        }
    }
}