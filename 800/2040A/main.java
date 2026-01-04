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
            int k = sc.nextInt();
            
            int arr[] = new int[n];
            for(int i=0;i<n;i++)
                arr[i] = sc.nextInt();
            
            Boolean flag = false;
            int index = -1;
            
            for(int i=0;i<n;i++)
            {
                Boolean check = true;
                for(int j=0;j<n;j++)
                {
                    if(i == j)
                        continue;
                    
                    if(Math.abs(arr[i]-arr[j]) % k == 0)
                        check = false;
                    if(check == false)
                        break;
                }
                if(check == true)
                {
                    flag = true;
                    index = i;
                    break;
                }
            }
            
            if(flag)
                System.out.println("YES" + "\n" + (index+1));
            else
                System.out.println("NO");
        }
    }
}