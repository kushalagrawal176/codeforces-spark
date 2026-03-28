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
            int k = sc.nextInt();
            
            int num=Math.min(x, y);
    		System.out.println("0 0 " + num + " " + num);
    		System.out.println(num + " 0 0 " + num);
        }
    }
}