import java.util.*;
public class main
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while(t-- > 0)
        {
            int n = sc.nextInt(), counter = 0;
            int a[] = new int[2*n+1];
 
            for(int i=1;i<=2*n;i++)
                a[i] = sc.nextInt();
 
            for(int k=1;k<2*n;k++)
            {
                if(a[k] != -1)
                {
                    for(int j=k+1;j<=2*n;j++)
                    {
                        if(a[k] != -1 && a[j] != -1 && (a[k]+a[j]) % 2 == 0 && counter < n-1)
                        {
                            System.out.println(k+" "+j);
                            a[k] = -1;
                            a[j] = -1;
                            counter++;
                        }
                    }
                }
            }
        }
    }
}