import java.util.Arrays;

//StringBuilder is fast, not synchronized and mutable
public class StringBuilderExample {
	static void print(StringBuilder str)
	{
		int i,sz;
		sz=str.length();
		System.out.println(str);
		
		for(i=0;i<sz;i++)
			System.out.print(str.charAt(i)); //Prakhar
		System.out.println();
		
		str.replace(0,2,"h"); //hakhar - 2 is not included
		System.out.println(str);
		str.replace(0,1, "Pr"); //Prakhar - 1 is not included
		System.out.println(str);
		
		str.append(" Sengar"); //Prakhar Sengar
		System.out.println(str);
		
		str.insert(8,"Singh "); //Prakhar Singh Sengar
		System.out.println(str);
		str.delete(7, 20); //Prakhar - 20 is not included here
		System.out.println(str); 
		
		str.reverse(); //rahkarP
		System.out.println(str); 
		str.reverse(); //Prakhar
		System.out.println(str);
		
		char ch[]=str.toString().toCharArray();
		Arrays.sort(ch);
		str=new StringBuilder(new String(ch)); //Paahkrr
		System.out.println(str);
		
		str.reverse(); //rrkhaaP
		System.out.println(str);
	}
}
