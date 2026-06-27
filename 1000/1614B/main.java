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
			List<int[]> a = new ArrayList<>();
			
			for(int i=1;i<=n;i++)
				a.add(new int[]{i,sc.nextInt()});
			
			a.sort((a1,a2)->a2[1]-a1[1]);
			
			int[] x = new int[n+1];
			
			int index = 1;
			long total = 0;
			boolean changeSign = false;
			for(int[] arr : a)
			{
				x[arr[0]] = changeSign?-index:index;
				total += 2L*index*arr[1];
 
				if(changeSign) 
				    index++;
				changeSign = !changeSign;
			}
			
			System.out.println(total);
			for(int i=0;i<=n;i++)
			    System.out.print(x[i] + " ");
			System.out.println();
		}
	}
}