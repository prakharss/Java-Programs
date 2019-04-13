import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int i;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Set<String> st = new HashSet<String>();
        for(i=0;i<n;i++)
        {
            st.add(scan.next());
        }    

        System.out.println(st.size());
        for(String s:st)
            System.out.println(s);
    }
}