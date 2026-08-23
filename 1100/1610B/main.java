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
			for(int i = 0; i < n ;i++)
                arr[i] = sc.nextInt();
			
			boolean flag = true;
			for(int i=0;i<n/2;i++) 
            {
				if(arr[i] != arr[n-i-1]) 
                {
					flag = check(arr, arr[i]) || check(arr, arr[n-i-1]);
 
					break;
				}
			}
			
            System.out.println(flag == true ? "YES" : "NO");
		}
	}
 
	public static boolean check(int arr[], int val) 
    {
		int n = arr.length;
		int i = 0;
		int j = n-1;
		
		while(i < j)
        {
			if(arr[i] == val)
                i++;
			else if(arr[j] == val)
                j--;
			else if(arr[i] != arr[j])
                return false;
			else 
            {
				i++;
				j--;
			}
		}
 
		return true;
	}
}