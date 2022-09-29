package assignments;

import java.util.Scanner;
class ElseIf
{
    public static void main(String []ad)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any character :");
        char i = s.next().charAt(0);
        if(i>=48&&i<=57)
        {
            System.out.println(i+" is a number.");
        }
        else if(i>=97&&i<=122)
        {
            System.out.println(i+" is a small alphabet.");
        }
        else if(i>=65&&i<=90)
        {
            System.out.println(i+" is a capital alphabet.");
        }
        else
        {
            System.out.println(i+" is a special character.");
        }
    }
}