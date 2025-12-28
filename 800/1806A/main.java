import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            
            if(d < b)
                System.out.println(-1);
            else
            {
                int moves = d - b;
                a += moves;
                
                if(a < c)
                    System.out.println(-1);
                else
                {
                    moves += a - c;
                    System.out.println(moves);
                }
            }
        }
    }
}