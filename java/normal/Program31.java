package normal;
class Program31
{
	public static void main(String[]args)
	{
		int a=10;
		int b=20;
		int c=30;
		int big=a>b?a:b;
		int bigger=big>c?big:c;
		int biggest=c>(a>b?a:b)?c:(a>b?a:b);
		System.out.println(bigger);
		System.out.println(biggest);
	}
}			