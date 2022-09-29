package assignments;

import java.util.Scanner;
class ReverseNumber
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any number to reverse it :");
        int num = s.nextInt();
        int rev = 0;
        for(int i=num;i>0;i=i/10)
        {
            rev = rev*10 + i%10;
        }
        System.out.println("The reverse no. is : "+rev);
    }   
}
