import java.util.*;

public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        
        // Replace "WUB" with space, trim, and normalize multiple spaces
        String result = st.replaceAll("WUB", " ").trim().replaceAll("\\s+", " ");
        
        System.out.println(result);
    }
}
