import java.util.Scanner;
class StrongNumber
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int num = s.nextInt();
        strongNum(num);
    }
    public static void strongNum(int x)
    {
        int sum = 0;
        for(int i=x;i>0;i/=10)
        {
            sum = sum + factorialNum(i%10);
        }
        if(sum == x)
        {
            System.out.println("Sum of factorials = "+sum);
            System.out.println("Hence, It is a strong number");
        }
        else
        {
            System.out.println("It is not a strong number");
        }
    }
    public static int factorialNum(int x)
    {
        int fact = 1;
        for(int i = 1;i<=x;i++)
        {
            fact = fact * i;
        }
        System.out.println("Factorial of "+x+" = "+fact);
        return fact;
    }
}