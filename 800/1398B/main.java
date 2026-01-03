import java.util.*;
public class main 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while(t-- > 0)
		{
			String s = sc.nextLine();
			int sum = 0;
			String s1[] = s.split("0");

			Arrays.sort(s1,Collections.reverseOrder());

			for(int i=0;i<s1.length;i=i+2)
				sum = sum + s1[i].length();

			System.out.println(sum);
		}
	}
}