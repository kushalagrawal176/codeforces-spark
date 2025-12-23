import java.util.*;
public class main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0)
        {
            int n = sc.nextInt();
            int[] arr = new int[n];
 
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
 
            for (int i = 0; i < n; i++)
            {
                int m = sc.nextInt();
                String str = sc.next();
                int c = 0;
 
                for (int j = 0; j < m; j++) 
                {
                    char ch = str.charAt(j);
                    if (ch == 'U') 
                        c--;
                    else 
                        c++;
                }
 
                arr[i] = (arr[i] + c + 10) % 10; 
            }
 
            for (int i = 0; i < n; i++)
                System.out.print(arr[i] + " ");
        
            System.out.println();
        }
    }
}