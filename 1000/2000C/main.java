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
            int arr[] = new int[n];
 
            for(int i=0;i<n;i++) 
                arr[i] = sc.nextInt();
 
            int m = sc.nextInt();
            for(int i=0;i<m;i++)
            {
                String s = sc.next();
 
                if(s.length()!=n) 
                {
                    System.out.println("NO"); 
                    continue;
                }
 
                HashMap<Integer, Character> mapping = new HashMap<>();
 
                boolean valid = true;
                for(int j=0;j<n;j++)
                {
                    if(mapping.containsKey(arr[j]))
                    {
                        if(mapping.get(arr[j])!=s.charAt(j)) 
                        {
                            valid = false; 
                            break;
                        }
                    }
 
                    if(mapping.containsValue(s.charAt(j)))
                    {
                        if(mapping.get(arr[j]) == null || mapping.get(arr[j]) != s.charAt(j)) 
                        {
                            valid = false; 
                            break;
                        }
                    }
 
                    mapping.put(arr[j], s.charAt(j));
                }
 
                System.out.println((valid)?"YES":"NO");
            }
        }
    }
}