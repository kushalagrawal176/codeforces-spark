import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        int n = s.length();
        
        int a[] = new int[n];
        
        for(int i=1;i<n;i++)
        {
            if(s.charAt(i-1) == s.charAt(i))
                a[i] = a[i-1]+1;
            else
                a[i] = a[i-1];
        }
        
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int l = sc.nextInt();
            int r = sc.nextInt();
            
            System.out.println(a[r-1] - a[l-1]);
        }
    }
}