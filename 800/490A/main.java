import java.util.*;
public class main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int i,k,x=0,y=0,z=0;

		int n= sc.nextInt();

		int[] a= new int[n];
		int[] b= new int[n];
		int[] c= new int[n];

		for(i=0;i<n;i++)
		{
			k=sc.nextInt();
			if(k == 1)
			{
				a[x]=i;
				x++;
			}
			else if(k == 2)
				{
					b[y]=i;
					y++;
				}
			else
			{
				c[z]=i;
				z++;
			}
		}

		k=Math.min(x, Math.min(y, z));
		System.out.println(k);
        
		for(i=0;i<k;i++)
		{
			System.out.println(a[i]+1+" "+(b[i]+1)+" "+(c[i]+1));
		}
	}
}