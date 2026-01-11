import java.util.*;

public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();

        // Push characters of both strings into stacks
        for (int i = 0; i < a.length(); i++)
            st1.push(a.charAt(i));

        for (int i = 0; i < b.length(); i++) 
            st2.push(b.charAt(i));

        int cnt = 0;
        // Compare from the end (top of stacks)
        while (!st1.isEmpty() && !st2.isEmpty() && st1.peek().equals(st2.peek())) 
        {
            cnt += 2;
            st1.pop();
            st2.pop();
        }

        System.out.println(a.length() + b.length() - cnt);
    }
}
