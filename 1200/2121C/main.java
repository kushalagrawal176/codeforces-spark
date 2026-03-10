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
            
            int maxi = Integer.MIN_VALUE;
            
            int a[][] = new int[n][m];
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    a[i][j] = sc.nextInt();
                    maxi = Math.max(maxi, a[i][j]);
                }
            }
            
            int rows[] = new int[n];
            int columns[] = new int[m];
            
            int cnt = 0;
            
            for(int i=0;i<n;i++)
            {
                int c = 0;
                for(int j=0;j<m;j++)
                {
                    if(a[i][j] == maxi)
                        c++;
                }
                
                cnt += c;
                rows[i] = c;
            }
            
            for(int i=0;i<m;i++)
            {
                int c = 0;
                for(int j=0;j<n;j++)
                {
                    if(a[j][i] == maxi)
                        c++;
                }
 
                columns[i] = c;
            }
            
            boolean flag = false;
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    int c = rows[i] + columns[j];
                    if(a[i][j] == maxi)
                        c--;
 
                    if(c == cnt)
                    {
                        flag = true;
                        break;
                    }
                }
            }
            
            if(flag == true)
                System.out.println(maxi-1);
            else
                System.out.println(maxi);
        }
    }
}