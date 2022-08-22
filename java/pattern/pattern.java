// to print character "N"
class pattern
{
	public static void main(String []args)
	{
		for(int i=0;i<=10;i++)
		{
			for(int j=0;j<=10;j++)
			{
				if(j==0)
					{
						System.out.print("*");
					}
				if(j>0||j<(i+1))
					{
						System.out.print(" ");
					}
				if(j==(i+1))
					{
						System.out.print("*");
					}
				if(j<10||j>=(i+1))
					{
						System.out.print(" ");
					}
				if(j==10)
					{
						System.out.print("*");
					}

			}
				System.out.println();
		}
	}
}
