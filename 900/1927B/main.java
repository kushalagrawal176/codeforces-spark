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
            int a[] = new int[200001];
            
            for(int i=0;i<n;i++)
            {
                int c = sc.nextInt();
                
                System.out.print((char)('a'+a[c]));
                a[c]++;
            }
            
            System.out.println();
        }
    }
}