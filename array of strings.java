import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int i;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        String str[] = new String[20];
        for(i=0;i<n;i++)
            str[i]=scan.next();
            

        for(i=0;i<n;i++)
            System.out.print(str[i]+" ");
    }
}