class Bike {    
	static void yoyo()
	{
		System.out.println("running safely");
	}
}  

class Solution extends Bike{  
	void run(){System.out.println("running safely");}  
	public static void main(String args[]) {  
		Bike obj = new Solution();  
		obj.yoyo();  
	}
}