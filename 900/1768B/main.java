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
            int k = sc.nextInt();
 
            int count = 0;
 
            for(int i=0;i<n;i++)
            {
                if(sc.nextInt() == count+1)
                    count++;
            }
 
            System.out.println(Math.ceilDiv(n-count, k));
        }
    }
}