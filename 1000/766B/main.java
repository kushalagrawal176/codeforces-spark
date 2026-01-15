import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            a[i] = sc.nextInt();
        
        Arrays.sort(a);
        
        boolean flag = false;
        for(int i=0;i<n-2;i++)
        {
            if(a[i] + a[i+1] > a[i+2])
            {
                flag = true;
                break;
            }
        }
        
        if(flag == true)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}