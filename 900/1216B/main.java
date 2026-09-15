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
 
        Integer idx[] = new Integer[n];
        for(int i=0;i<n;i++)
            idx[i] = i;
 
        Arrays.sort(idx,(i,j) -> a[j]-a[i]);
        long shots = 0;
 
        for(int k=0;k<n;k++)
            shots += (long)a[idx[k]]*k+1;
 
        System.out.println(shots);
        for(int i=0;i<n;i++)
            System.out.print((idx[i]+1)+" ");
    }
}