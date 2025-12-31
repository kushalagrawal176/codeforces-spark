import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int a[] = new int[n+1];
        for(int i=1;i<=n;i++)
            a[i] = sc.nextInt();
        
        boolean flag = false;
        for(int i=1;i<=n;i++)
        {
            if(a[a[a[i]]] == i)
            {
                flag = true;
                break;
            }
        }
        
        if(flag)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}