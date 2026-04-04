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
			int x = sc.nextInt();
 
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();
 
			Arrays.sort(arr);
 
			int l = 0;
			int r = n-1;
 
			long res = 0;
			long cur = 0;
 
			ArrayList<Integer> list = new ArrayList<>();
 
			while(l <= r)
			{
				if(cur + arr[r] >= x)
				{
					cur += arr[r];
					res += arr[r];
 
					list.add(arr[r]);
					r--;
 
					cur = cur%x;
				}
				else
				{
					cur += arr[l];
					list.add(arr[l]);
					l++;
				}
			}
 
			System.out.println(res);
			for(int ele : list)
				System.out.print(ele + " ");
			System.out.println();
		}
	}			
}