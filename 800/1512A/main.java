import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t>0)
        {
            int n = sc.nextInt();
            int num1 = -1;
            int num2 = -1;
            int cnt1 = 0;
            
            int a[] = new int[n];
            
            int index1 = 0;
            int index2 = 0;
            
            for(int i=0;i<n;i++)
            {
                a[i] = sc.nextInt();
                
                if(num1 == -1)
                {
                    index1 = i+1;
                    cnt1++;
                    num1 = a[i];
                }
                else if(num1 == a[i])
                    cnt1++;
                else
                {
                    index2 = i+1;
                    num2 = a[i];
                }
            }
            if(cnt1 > 1)
                System.out.println(index2);
            else
                System.out.println(index1);
                
            t--;
        }
    }
}