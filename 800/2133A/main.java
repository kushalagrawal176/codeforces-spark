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
            
            boolean flag = false;
            
            for(int i=0;i<n;i++)
            {
                int a = sc.nextInt();
                freq[a]++;
                
                if(freq[a] > 1)
                    flag = true;
            }
            
            if(flag == true)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}