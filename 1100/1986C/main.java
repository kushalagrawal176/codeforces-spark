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
            int m = sc.nextInt();
            int l = 0;
 
            String s[] = sc.next().split("");
            String c[];
            Set<Integer>set = new TreeSet<>();
 
            for(int i=0;i<m;i++)
                set.add(sc.nextInt());
 
            c = sc.next().split("");
            Arrays.sort(c);
 
            for(Integer a:set)
                s[a-1] = c[l++];
            for(String value:s)
                System.out.print(value+"");
 
            System.out.println();
        }
    }
}