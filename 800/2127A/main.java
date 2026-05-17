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
		    HashSet<Integer> a = new HashSet<>();
 
		    for(int i=0;i<n;i++)
		        a.add(sc.nextInt());
 
		    if(a.contains(-1)) 
		        a.remove(-1);
 
		    if(a.size() == 0 || (a.size() == 1 && a.contains(0) == false)) 
		        System.out.println("YES");
		    else 
		        System.out.println("NO");
		}
	}
}