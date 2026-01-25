import java.util.*;
public class main
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int m = sc.nextInt();
        int s = sc.nextInt();
        
        int[] arr = new int[m];
        int s1 = s-1;
        
        if(s==0 && m!=1 || m*9<s)
        {
            System.out.println("-1 -1");
            return;
        }
        
        String ans1 = "", ans2 = "";
        for(int i=0;i<m;i++)
        {
            ans1 += Math.min(9, s);
            s -= Math.min(9, s);
        }
        
        for(int i=0;i<m-1;i++)
        {
            ans2 = Math.min(9, s1) + ans2;
            s1 -= Math.min(9, s1);
        }
        
        ans2 = (s1+1) + ans2;

        System.out.println(ans2 + " " + ans1);
    }
}