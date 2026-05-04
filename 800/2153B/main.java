import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
 
            System.out.println(((x&y) == (y&z) && (x&z) == (x&y)) == true ? "YES" : "NO");
        }
    }
}