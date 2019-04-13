package com.java;
import java.util.*;

public class UseOfMap {

    public static void main(String[] args) {
        int i,n;
        String ans="";
        
        @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
        Map<String,Integer> mp = new HashMap<String,Integer>();

        n=scan.nextInt(); 
        String str[]=new String[n];
        for(i=0;i<n;i++)
        {
            str[i]=scan.next();
            if(!mp.containsKey(str[i]))
                mp.put(str[i],1);
            else
                mp.put(str[i],mp.get(str[i])+1);
        }

        int mx=0;
        Set<Map.Entry<String,Integer> > st=mp.entrySet();
        for(Map.Entry<String,Integer> entry: st)
        {
            System.out.println(entry.getKey()+" "+entry.getValue());
            if(entry.getValue()>mx)
            {
                mx=entry.getValue();
                ans=entry.getKey();
            }
        }  

        System.out.println(ans);
        System.out.println("\n\n");

        //another way to access map in collection
        Set<String> set=mp.keySet();
        for(String s:set)
        {
            System.out.println(s+" "+mp.get(s));
        }       
    }
}