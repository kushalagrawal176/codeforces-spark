// solution 1

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
            
            for(int i=0;i<n;i++)
                a[i] = sc.nextInt();
            
            Arrays.sort(a);
            int cnt = 0;
            
            for(int i=1;i<n;i++)
            {
                if(a[i] == a[i-1])
                    continue;
                
                cnt++;
            }
            
            cnt++;
            
            int ans = cnt;
            for(int i=0;i<n;i++)
            {
                if(a[i] < cnt)
                    continue;
                
                ans = a[i];
                break;
            }
            
            System.out.println(ans);
        }
    }
}

// solution 2
// import java.util.*;
// public class Main
// {
//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         int t = sc.nextInt();
        
//         while(t-- > 0)
//         {
//             int n = sc.nextInt();
//             HashMap<Integer, Integer> mp = new HashMap<>();
            
//             for(int i=0;i<n;i++)
//             {
//                 int a = sc.nextInt();
//                 if(mp.get(a) == null)
//                     mp.put(a, 1);
                
//                 mp.put(a, mp.get(a)+1);
//             }
            
//             int val = mp.size();
            
//             while(mp.get(val) == null)
//                 val++;
            
//             System.out.println(val);
//         }
//     }
// }