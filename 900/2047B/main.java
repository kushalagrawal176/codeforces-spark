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
			String s = sc.next();
 
			int freq[] = new int[26];
			for(int i=0;i<s.length();i++)
				freq[s.charAt(i)-'a']++;
 
			int mini = s.length();
			int maxi = 0;
 
			char min_ch = ' ';
			char max_ch = ' ';
 
			for(int i=0;i<26;i++)
			{
				if(freq[i] == 0)   
				    continue;
 
				if(freq[i] < mini)
				{
					mini = freq[i];
					min_ch = (char)('a'+i);
				}
 
				if(freq[i] >= maxi)
				{
					maxi = freq[i];
					max_ch = (char)('a'+i);
				}
			}
 
			StringBuilder sb = new StringBuilder(s);
			for(int i=0;i<sb.length();i++)
			{
				if(sb.charAt(i) == min_ch)
				{
					sb.setCharAt(i,max_ch);
					break;
				}
			}
 
			System.out.println(sb.toString());
		}
	}
}