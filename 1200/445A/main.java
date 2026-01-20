import java.util.*;
 
public class main
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		for(int i=0;i<n;i++) 
		{
			char[] s = sc.next().toCharArray();
			for(int j=0;j<m;j++) 
			{
				if(s[j]=='.') 
				{
					if((i+j)%2!=0)
						s[j]='W';
					else
						s[j]='B';
				}
				
				System.out.print(s[j]);
			}
			
			System.out.println();
		}
	}
}