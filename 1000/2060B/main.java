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
            int m = sc.nextInt();
 
            int arr[] = new int[n];
            int p = 0;
 
            for(int j=0;j<n;j++)
            {
                int l = sc.nextInt()%n;
                for(int i=1;i<m;i++)
                {
                    int a = sc.nextInt();
                    if(l != a%n)
                        p = -1;
                }
 
                if(p != -1)
                    arr[l] = j+1;
            }
 
            if(p == -1)
                System.out.print(p);
            else 
            {
                for(int i=0;i<n;i++)
                    System.out.print(arr[i] + " ");
            }
 
            System.out.println();
        }
    }
}