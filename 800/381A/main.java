import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        
        int left = 0;
        int right = n-1;
        
        int turn = 0;
        
        int a = 0;
        int b = 0;
        
        while(left <= right)
        {
            if(arr[left] >= arr[right])
            {
                if(turn == 0)
                    a = a + arr[left];
                else
                    b = b + arr[left];
                
                left++;
            }
            else
            {
                if(turn == 0)
                    a = a + arr[right];
                else
                    b = b + arr[right];
                
                right--;
            }
            
            turn = turn ^ 0 ^ 1;
        }
        
        System.out.println(a+" "+b);
    }
}