package assignments;

import java.util.Scanner;
class method3{
public static void main(String ad[])
{
Scanner s=new Scanner(System.in);
byte b=s.nextByte();
short sh=s.nextShort();
int i=s.nextInt();
long l=s.nextLong();
float f=s.nextFloat();
double d=s.nextDouble();
char c=s.next().charAt(0);
boolean bo=s.nextBoolean();
System.out.println(b+" "+sh+" "+i+" "+l+" "+f+" "+d+" "+c+" "+bo);
}
}