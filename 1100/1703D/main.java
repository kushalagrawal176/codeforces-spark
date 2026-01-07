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
            String a[] = new String[n];
            
            HashMap<String, Integer> mp = new HashMap<String, Integer>();
            
            for(int i=0;i<n;i++)
            {
                a[i] = sc.next();
                mp.put(a[i], 1);
            }
            
            for(int i=0;i<n;i++)
            {
                boolean flag = false;
                for(int j=0;j<a[i].length();j++)
                {
                    String s1 = a[i].substring(0, j); // prefix
                    String s2 = a[i].substring(j);    // suffix
                    
                    if(mp.get(s1) == null || mp.get(s2) == null) // not found
                        continue;
                    
                    flag = true;
                    break;
                }
                
                System.out.print(flag == true ? 1:0); 
            }
            
            System.out.println();
        }
    }
}