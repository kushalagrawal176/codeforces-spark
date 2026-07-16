import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        
        String s = sc.next();
        int freq[] = new int[26];
        
        for(int i=0;i<s.length();i++)
            freq[s.charAt(i)-'a']++;
        
        // Check if all characters can be evenly divided
        // If not, we cannot form k identical substrings
        // So we return -1
        boolean flag = true;
        for(int i=0;i<26;i++)
        {
            if(freq[i]%k != 0)
            {
                flag = false;
                break;
            }
        }
        
        if(flag == false)
        {
            System.out.println(-1);
            return ;
        }

        // If we reach here, it means we can form k identical substrings
        // We can construct the result by taking each character
        // the required number of times and printing it
        for(int l=0;l<k;l++)
        {
            for(int i=0;i<26;i++)
            {
                for(int j=0;j<freq[i]/k;j++)
                    System.out.print((char)(i+'a'));
            }
        }
    }
}