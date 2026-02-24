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
            
            int cnt = 0;
            
            for(int i=0;i<n;i++)
            {
                int a = sc.nextInt();
                
                if(freq[a] == 0)
                    cnt++;
                
                freq[a]++;
            }
            
            System.out.println(2*cnt-1);
        }
    }
}