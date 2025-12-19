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
            int a[] = new int[n];
            
            for(int i=0;i<n;i++)
                a[i] = sc.nextInt();
            
            int i = 0;
            int j = n-1;
            int p = 1;
            int q = n;
            
            while(i < j)
            {
                if(a[i] == p)
                {
                    p++;
                    i++;
                }
                else if(a[i] == q)
                {
                    q--;
                    i++;
                }
                else if(a[j] == p)
                {
                    p++;
                    j--;
                }
                else if(a[j] == q)
                {
                    q--;
                    j--;
                }
                else 
                    break;
            }
            
            if(i == j)
                System.out.println(-1);
            else 
                System.out.println((i+1) + " "+(j+1));
        }
    }
}