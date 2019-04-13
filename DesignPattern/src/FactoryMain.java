public class FactoryMain {
	public static void main(String a[])
	{
		OperatingSytemFactory osf = new OperatingSytemFactory();
		OS obj = osf.getInstance("Open");
		obj.spec();

		obj = osf.getInstance("Closed");
		obj.spec();

		obj = osf.getInstance("Other");
		obj.spec();
	}
}

class OperatingSytemFactory
{
	public OS getInstance(String str)
	{
		if(str.equals("Open"))
			return new Android();
		else if(str.equals("Closed"))
			return new IOS();
		else
			return new Windows();
	}
}

interface OS
{
	void spec();
}

class Android implements OS
{
	@Override
	public void spec()
	{
		System.out.println("Most Powerful OS");
	}
}

class IOS implements OS
{
	@Override
	public void spec()
	{
		System.out.println("Most Secure OS");
	}
}

class Windows implements OS
{
	@Override
	public void spec()
	{
		System.out.println("I am about to die");
	}
}
