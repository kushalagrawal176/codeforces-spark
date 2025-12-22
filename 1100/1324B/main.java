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
            int a[] = new int[n];
            
            int freq[] = new int[5001];
            
            for(int i=0;i<n;i++)
            {
                a[i] = sc.nextInt();
                freq[a[i]]++;
            }
            
            boolean flag = false;
            for(int i=0;i<n-1;i++)
            {
                if(freq[a[i]] == 1)
                    continue;
                
                if(freq[a[i]] > 2)
                {
                    flag = true;
                    break;
                }
                
                if(a[i] == a[i+1])
                {
                    i++;
                    continue;
                }
                
                flag = true;
                break;
            }
            
            if(flag == true)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}