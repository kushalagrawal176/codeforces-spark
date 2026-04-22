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
            int arr[] = new int[n];

            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();

            int ans = Math.min(arr[1], arr[0])+arr[0];

            System.out.println(ans);
        }
    }
}