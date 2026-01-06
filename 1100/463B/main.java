import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
 
        int maxi = -1;
        
        for(int i=0;i<n;i++)
            maxi = Math.max(maxi, sc.nextInt());
        
        System.out.println(maxi);
    }
}
