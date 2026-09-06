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

            // Input the matrix
            int a[][] = new int[n][m];
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                    a[i][j] = sc.nextInt();
            }
 
            int cnt = 0;

            // BFS to find connected components
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    if(a[i][j] == 0)
                        continue;

                    // Start BFS
                    int c = 0;
                    Queue<int[]> q = new LinkedList<>();
                    q.add(new int[]{i,j});
 
                    while(q.size() > 0)
                    {
                        int idx[] = q.poll();
                        int c_i = idx[0];
                        int c_j = idx[1];

                        // If the cell is already visited or 0
                        // Skip it
                        if(a[c_i][c_j] == 0)
                            continue;
        
                        c += a[c_i][c_j];
                        a[c_i][c_j] = 0; // Mark as visited

                        int s = q.size();

                        // Check all 4 directions
                        if(c_i-1 >= 0 && a[c_i-1][c_j] != 0)
                            q.add(new int[]{c_i-1,c_j});
                        if(c_i+1 < n && a[c_i+1][c_j] != 0)
                            q.add(new int[]{c_i+1,c_j});
                        if(c_j-1 >= 0 && a[c_i][c_j-1] != 0)
                            q.add(new int[]{c_i,c_j-1});
                        if(c_j+1 < m && a[c_i][c_j+1] != 0)
                            q.add(new int[]{c_i,c_j+1});
                    }
 
                    cnt = Math.max(cnt, c);
                }
            }
 
            System.out.println(cnt);
        }
    }
}