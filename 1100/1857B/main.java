import java.util.*;
public class main
{
	public static void main(String args[]) 
    {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0)
        {
            String str = sc.next();
 
            str = '0'+str;
            char[] a = str.toCharArray();
            int len = a.length;
 
            for(int i=a.length-1;i>=0;i--) 
            {
                if(a[i]>='5') 
                {
                    a[i-1]++;
                    len=i;
                }
            }
            
            for(int i=(a[0]=='0'?1:0);i<a.length;i++)
                System.out.print(i<len? a[i]: '0');
            System.out.println();
		}
	}
}