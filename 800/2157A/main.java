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
            int freq[] = new int[101];
            
            for(int i=0;i<n;i++)
                freq[sc.nextInt()]++;
            
            int cnt = 0;
            for(int i=0;i<=100;i++)
            {
                if(freq[i] == 0 || freq[i] == i)
                    continue;
                
                cnt += (freq[i] < i)? freq[i] : freq[i]-i;
            }
            
            System.out.println(cnt);
        }
    }
}