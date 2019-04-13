class SingletonClass {
	SingletonMain obj1 = SingletonMain.getInstance();
	SingletonMain obj2 = SingletonMain.getInstance();

	//obj1 and obj2 are equal
	public static void main(String[] args)
	{
		SingletonClass singleton = new SingletonClass();
		System.out.println(singleton.obj1==singleton.obj2);
	}
}

class SingletonMain {
	private static SingletonMain uniqueInstance;
	private SingletonMain() {}

	public static SingletonMain getInstance()
	{
		if(uniqueInstance==null)
		{
			uniqueInstance=new SingletonMain();
		} 

		return uniqueInstance;
	}
}
