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
            String s = sc.next();
            
            int ans=n-1;
            for(int i=1;i<n-1;i++)
            {
                if(s.charAt(i-1)==s.charAt(i+1))
                    ans--;
            }
            
            System.out.println(ans); 
        }
    }
}
