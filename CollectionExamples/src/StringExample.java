
public class StringExample {
	static void print(String str)
	{
		int i,sz;
		sz=str.length();
		System.out.println(str);
		for(i=0;i<sz;i++)
			System.out.print(str.charAt(i));
		
		str="I_am_hero";
		
	}
}
