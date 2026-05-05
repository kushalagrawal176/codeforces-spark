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
			int m = sc.nextInt();

			ArrayList<ArrayList<Integer>> x = new ArrayList<>();
			for(int i=0;i<=m;i++)
				x.add(new ArrayList<>());

			for(int i=0;i<n;i++) 
			{
				int l = sc.nextInt();
				for(int j=0;j<l;j++) 
				{
					int a = sc.nextInt();
					x.get(a).add(i);
				}
			}

			boolean b = true;
			for(int i=1;i<=m;i++) 
			{
				if(x.get(i).size() == 0)
					b = false;
			}

			Set<Integer> s = new HashSet<>();
			for(int i=1;i<=m;i++) 
			{
				if(x.get(i).size() == 1)
					s.add(x.get(i).get(0));
			}

			if(b && n-s.size() >= 2)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}