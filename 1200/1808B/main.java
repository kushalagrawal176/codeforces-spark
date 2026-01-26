import java.util.*;
public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // number of test cases
        
        while (t-- > 0) 
        {
            int n = sc.nextInt();  // number of players
            int m = sc.nextInt();  // numbers per card
            
            int[][] cards = new int[n][m];
            for (int i = 0; i < n; i++) 
            {
                for (int j = 0; j < m; j++) 
                {
                    cards[i][j] = sc.nextInt();
                }
            }
            
            long totalWinnings = 0;
            
            // Process each column independently
            for (int j = 0; j < m; j++) 
            {
                int[] column = new int[n];
                for (int i = 0; i < n; i++) 
                {
                    column[i] = cards[i][j];
                }
                
                Arrays.sort(column);
                
                // Contribution formula
                for (int k = 0; k < n; k++) {
                    totalWinnings += (long) column[k] * (2L * k - n + 1);
                }
            }
            
            System.out.println(totalWinnings);
        }
    }
}