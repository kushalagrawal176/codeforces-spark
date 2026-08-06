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
        int i = 0;
        int j = n-1;
        
        while(i < n && a[i] == a[0])
            i++;
        while(j >= 0 && a[j] == a[n-1])
            j--;
        
        System.out.println(Math.max(0, j-i+1));
    }
}