import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int i;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        int a[] = new int[20];
        for(i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
            a[i]=a[i]+1;
        }

        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}