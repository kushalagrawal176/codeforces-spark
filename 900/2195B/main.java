import java.util.*;
public class main
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0) 
        {
            int n = sc.nextInt();
            int[] a = new int[n];
            int f = 0;
            
            for(int i = 0; i < n; i++) 
            {
                a[i] = sc.nextInt();
                int x = i + 1;
                
                while(x % 2 == 0) 
                    x /= 2;
                    
                while(a[i] % 2 == 0) 
                    a[i] /= 2;
                    
                if(x != a[i]) 
                    f = 1;
            }
            if(f == 0) 
                System.out.println("YES");
            else 
                System.out.println("NO");
        }
    }
}