import java.util.*;
public class main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[] = new int[n];
            
            for(int i=0;i<n;i++) 
                arr[i] = sc.nextInt();
            Arrays.sort(arr);
            
            int i = 0, j = n -1, count= 0;
            while(i<j)
            {
                if(arr[i] + arr[j] == k) 
                {
                    count++; 
                    i++; 
                    j--;
                }
                else if(arr[i]+arr[j]<k) 
                    i++;
                else 
                    j--;
            }
            
            System.out.println(count);
        }
    }
}