import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            a[i] = sc.nextInt();
        
        int sum = 0;
        int mini;
        int index = 0;
        
        for(int i=0;i<k;i++)
            sum += a[i];
            
        mini = sum;
        
        for(int i=k;i<n;i++)
        {
            sum += a[i] - a[i-k];
            if(sum < mini)
            {
                mini = sum;
                index = i-k+1;
            }
        }
        
        System.out.println(index+1);
    }
}