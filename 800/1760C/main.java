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

            int max1 = -1;
            int max2 = -1;

            for(int i=0;i<n;i++)
            {
                a[i] = sc.nextInt();

                if(a[i] >= max1)
                {
                    max2 = max1;
                    max1 = a[i];
                }
                else if(a[i] > max2)
                    max2 = a[i];
            }

            for(int i=0;i<n;i++)
            {
                if(a[i] == max1 && a[i] == max2)
                    System.out.print(0+" ");
                else if(a[i] == max1 && a[i] != max2)
                    System.out.print(a[i]-max2+" ");
                else
                    System.out.print(a[i]-max1+" ");
            }

            System.out.println();
        }
    }
}