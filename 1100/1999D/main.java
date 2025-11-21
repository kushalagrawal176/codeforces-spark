import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = sc.next();
            StringBuilder a = new StringBuilder(s);
            
            s = sc.next();
            StringBuilder b = new StringBuilder(s);
            
            StringBuilder ans = new StringBuilder("");
            
            int ptr1 = 0;
            int ptr2 = 0;
            
            while(ptr1 < a.length() && ptr2 < b.length())
            {
                if(a.charAt(ptr1) == '?')
                {
                    ans.append(b.charAt(ptr2));
                    ptr1++;
                    ptr2++;
                    
                    continue;
                }
                else if(a.charAt(ptr1) == b.charAt(ptr2))
                {
                    ptr1++;
                    ptr2++;
                }
                else
                    ptr1++;
                
                ans.append(a.charAt(ptr1-1));
            }
            
            while(ptr1 < a.length())
            {
                if(a.charAt(ptr1) == '?')
                    ans.append("a");
                else
                    ans.append(a.charAt(ptr1));
                
                ptr1++;
            }
            
            if(ptr2 == b.length())
                System.out.println("YES"+"\n"+ans);
            else
                System.out.println("NO");
        }
    }
}