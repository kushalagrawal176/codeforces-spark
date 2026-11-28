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
			String ans = "";
 
			char arr[] = {'a','e','i','o','u'};
 
			for(int i=0;i<5;i++)
			{
				int x = (i < n%5 ? 1:0);
 
                for(int j=0;j<n/5+x;j++)
                    ans += arr[i];
			}
 
			System.out.println(ans);
		}
	}
}