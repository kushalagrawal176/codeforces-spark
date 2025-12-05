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
            
            int left = 0;
            int right = n-1;
            
            while(left < right)
            {
                System.out.print(a[left]+" "+a[right]+" ");
                left++;
                right--;
            }
            
            if(left == right)
                System.out.print(a[left]+" ");
            
            System.out.println();
        }
    }
}