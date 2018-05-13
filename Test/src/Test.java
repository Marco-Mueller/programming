
public class Test
{
	public static void testMethod()
	{
		System.out.println("this is the output of the test method");
	}
	
	public static int ggt(int a, int b)
	{
		System.out.println("a\t\tb\t\tq\t\tr");
		System.out.println("---------------------------------------------------------");
		int q,r = -1;
		while(r != 0)
		{
			r = a % b;
			q = (a / b);
			
			a = b;
			b = r;
			
			System.out.printf("%d\t\t%d\t\t%d\t\t%d\n",a,b,q,r);
		}
		return a;
	}
}
