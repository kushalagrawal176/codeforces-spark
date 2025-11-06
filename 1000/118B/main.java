import java.util.*;
 
public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        for(int i = 0; i < 2 * n + 1; i++)
        {
            int k = 0;
            int j = n - Math.abs(i - n);
            
            while(k < n - j) 
            { 
                System.out.print("  "); 
                k++;
            }
            
            k = j;
            while(k > -j) 
            { 
                System.out.print(j - Math.abs(k) + " "); 
                k--;
            }
            
            System.out.print("0\n");
        }
    }
}