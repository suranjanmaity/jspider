import java.util.Scanner;
class Palindrome
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any number to check palindrome :");
        int num = s.nextInt();
        int rev = 0;
        for(int i=num;i>0;i=i/10)
        {
            rev = rev*10 + i%10;
        }
        if(rev==num)
        System.out.println("The number is palindrome");
        else
        System.out.println("The number is not palindrome");
    }   
}
