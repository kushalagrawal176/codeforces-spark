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
			int b[] = new int[n+1];
 
			for(int i=0; i<n; i++)
				a[i] = sc.nextInt();
 
			for(int i=0; i<n+1; i++)
				b[i] = sc.nextInt();
 
			long sum = 0; 
			int e = Integer.MAX_VALUE;
 
			for(int i=0; i<n; i++)
            {
				sum += Math.abs(a[i] - b[i]);
				e = Math.min(e, Math.min(Math.abs(a[i] - b[n]), Math.abs(b[i] - b[n])));
 
				if(Math.min(a[i], b[i]) <= b[n] && b[n] <= Math.max(a[i], b[i]))
                    e = 0;
			}
 
			System.out.println(sum+e+1);
		}
	}
}