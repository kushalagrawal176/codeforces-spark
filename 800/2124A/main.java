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

            int len = -1;
            int ele1 = -1;
            int ele2 = -1;

            for(int i=0;i<n-1;i++)
            {
                if(a[i] <= a[i+1])
                    continue;

                len = 2;
                ele1 = a[i];
                ele2 = a[i+1];
                break;
            }

            if(len == -1)
                System.out.println("NO");
            else
            {
                System.out.println("YES");
                System.out.println(len+"\n"+ele1+" "+ele2);
            }
        }
    }
}