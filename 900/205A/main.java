import java.util.*;
public class main 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
 
        int min = Integer.MAX_VALUE, idx = -1, cnt = 0;
        for(int i=1; i<=n; i++) 
        {
            int x = sc.nextInt();
            if(x < min) 
            { 
                min = x; 
                idx = i; 
                cnt = 1; 
            }
            else if(x == min)
                cnt++;
        }
 
        System.out.print(cnt > 1 ? "Still Rozdil" : idx);
    }
}
