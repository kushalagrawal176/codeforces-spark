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
            String s = sc.next();
 
            Stack<Integer> st = new Stack<>();
            int cost = 0;
 
            for(int i=0;i<n;i++)
            {
                if(s.charAt(i) == '(')
                    st.push(i);
                else if(s.charAt(i) == '_')
                {
                    if(st.size() > 0)
                        cost += i-st.pop();
                    else
                        st.push(i);
                }
                else
                    cost += i-st.pop();
            }
 
            System.out.println(cost);
        }
    }
}