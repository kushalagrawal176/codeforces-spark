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
			long a[] = new long[n];
			
			for(int i=0;i<n;i++)
				a[i] = sc.nextLong();
			
			long ans = 1;
			boolean flag = false;
			
			while(!flag)
			{
				ans = ans*2;
				HashSet<Long> mod = new HashSet<>();
				for(int i=0;i<n;i++)
					mod.add(a[i]%ans);
				
				if(mod.size() == 2)
					flag = true;
			}
			
			System.out.println(ans);
        }
	}
	
}