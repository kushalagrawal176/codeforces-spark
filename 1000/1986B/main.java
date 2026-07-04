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
            int m = sc.nextInt();
            
            int a[][] = new int[n][m];
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                    a[i][j] = sc.nextInt();
            }

            // Find the maximum adjacent value for each cell
            // Initialize the maximum adjacent values
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    int maxi = -1;
                    if(i-1 >= 0)
                    {
                        if(a[i][j] <= a[i-1][j])
                            continue;
                        
                        maxi = Math.max(maxi, a[i-1][j]);
                    }
                    if(i+1 < n)
                    {
                        if(a[i][j] <= a[i+1][j])
                            continue;
                        
                        maxi = Math.max(maxi, a[i+1][j]);
                    }
                    if(j-1 >= 0)
                    {
                        if(a[i][j] <= a[i][j-1])
                            continue;
                        
                        maxi = Math.max(maxi, a[i][j-1]);
                    }
                    if(j+1 < m)
                    {
                        if(a[i][j] <= a[i][j+1])
                            continue;
                        
                        maxi = Math.max(maxi, a[i][j+1]);
                    }
                    
                    a[i][j] = (maxi == -1) ? a[i][j] : maxi;
                }
            }
            
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                    System.out.print(a[i][j] + " ");
                
                System.out.println();
            }
        }
    }
}