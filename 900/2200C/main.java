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
 
		    Stack<Character> st = new Stack<>();
 
		    for(char c : s.toCharArray())
            {
		        if(st.size() > 0 && st.peek() == c)
		            st.pop();
		        else
		            st.push(c);
		    }
 
		    System.out.println(st.isEmpty() ? "YES" : "NO");
		}
	}
}