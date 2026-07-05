import java.util.*;

public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) 
        {
            String s = sc.next();
            
            Stack<Integer> lower = new Stack<>();
            Stack<Integer> upper = new Stack<>();
            
            char[] arr = s.toCharArray();
            
            for (int i = 0; i < arr.length; i++) 
            {
                if (arr[i] == 'b' && !lower.isEmpty()) {
                    arr[lower.pop()] = 'b';
                } else if (arr[i] == 'B' && !upper.isEmpty()) {
                    arr[upper.pop()] = 'B';
                } else if (arr[i] >= 'A' && arr[i] <= 'Z') {
                    upper.push(i);
                } else {
                    lower.push(i);
                }
            }
            
            StringBuilder ans = new StringBuilder();
            for (char c : arr) 
            {
                if (c != 'b' && c != 'B') {
                    ans.append(c);
                }
            }
            
            System.out.println(ans.toString());
        }
    }
}
