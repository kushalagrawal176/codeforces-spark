import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int m = sc.nextInt();
        int boys[] = new int[m];
        
        for(int i=0;i<m;i++)
            boys[i] = sc.nextInt();
        
        int n = sc.nextInt();
        int girls[] = new int[n];
        
        for(int i=0;i<n;i++)
            girls[i] = sc.nextInt();
        
        Arrays.sort(boys);
        Arrays.sort(girls);
        
        int ptr1 = 0;
        int ptr2 = 0;
        
        int cnt = 0;
        while(ptr1 < m && ptr2 < n)
        {
            if(Math.abs(boys[ptr1]-girls[ptr2]) <= 1)
            {
                cnt++;
                ptr1++;
                ptr2++;
            }
            else if(boys[ptr1] > girls[ptr2])
                ptr2++;
            else
                ptr1++;
        }
        
        System.out.println(cnt);
    }
}