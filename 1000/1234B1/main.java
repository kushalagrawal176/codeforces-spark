import java.util.*;
public class main
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int k = sc.nextInt();
 
        List<Integer> arr = new ArrayList<>();
 
        for (int i = 0; i < n; i++) 
        {
            int a = sc.nextInt();
 
            if(!arr.contains(a)) 
                arr.add(0,a);
            if(arr.size() > k) 
                arr.remove(k);
        }
 
        System.out.println(arr.size());
        for(Integer ele : arr) 
            System.out.print(ele + " ");
    }
}