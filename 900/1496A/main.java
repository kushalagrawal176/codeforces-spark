import java.util.*;
public class main
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while(t-- > 0) 
        {
            int n = sc.nextInt(), k = sc.nextInt();
            String s = sc.next();
 
            boolean flag = true;
            for(int i=0; i<k; i++) 
            {
                if(s.charAt(i) != s.charAt(n-1-i)) 
                {
                    flag = false;
                    break;
                }
            }
 
            System.out.println(flag == true && 2*k < n ? "YES" : "NO");
        }
    }
}