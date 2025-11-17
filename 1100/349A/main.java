import java.util.*;

public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();  // Number of people in line
        
        // Counters for available change
        int count25 = 0;  
        int count50 = 0;  
        
        boolean possible = true;  // Flag to check if change can be given
        
        for (int i = 0; i < n; i++) 
        {
            int bill = sc.nextInt();  // Current customer's bill
            
            if (bill == 25) 
            {
                // Customer pays with 25, no change needed
                count25++;
            } 
            else if (bill == 50) 
            {
                // Customer pays with 50, needs 25 as change
                if (count25 > 0) {
                    count25--;
                    count50++;
                } else {
                    possible = false;  // No 25 available for change
                    break;
                }
            } 
            else 
            { // bill == 100
                // Customer pays with 100, needs 75 as change
                if (count50 > 0 && count25 > 0) {
                    // Best option: give one 50 and one 25
                    count50--;
                    count25--;
                } else if (count25 >= 3) {
                    // Alternative: give three 25s
                    count25 -= 3;
                } else {
                    possible = false;  // Not enough change
                    break;
                }
            }
        }
        
        // Final result
        System.out.println(possible ? "YES" : "NO");
    }
}