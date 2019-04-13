import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int i;
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        
        String ans="";
        for(i=0;i<str.length();i++)
        {
            int val=(int)str.charAt(i);
            if(val>=97 && val<=122)
                val=val-32;

            ans=ans+(char)val;
        }

        System.out.println(ans);
    }
}

