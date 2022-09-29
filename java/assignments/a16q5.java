package assignments;

import java.util.Scanner;
class Factorial
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int num = s.nextInt();
        factorialNum(num);
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