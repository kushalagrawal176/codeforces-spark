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
 
			int ans = 0;
			int c = 0;
			for(int i=n-2;i>=0;i--) 
            {
				while(i >= 0 && a[i] == a[n-1])
					i--;
 
				if(i >= 0)
					ans++;
 
				int b = n-1-(i);
				i = i-b+1;
			}
 
			System.out.println(ans);
		}
	}
}