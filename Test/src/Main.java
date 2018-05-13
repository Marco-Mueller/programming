
public class Main
{
	public static void main(String[] args)
	{
		int ggt = 0;
		int a = 192819;
		int b = 236;
		System.out.println("this is a dropbox test project");
		Test.testMethod();
		
		ggt = Test.ggt(a, b);
		System.out.printf("\nggt von %d und %d: %d", a, b, ggt);
		
	}
}
