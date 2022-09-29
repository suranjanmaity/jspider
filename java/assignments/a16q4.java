package assignments;

import java.util.Scanner;
class SwapTwoDigit
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any two digits number :");
        int num = s.nextInt();
        //  //  //  //  //  //  //  //
        // without loop logic       //
        // num = (num%10)*10+num/10 //
        //  //  //  //  //  //  //  //
        for(int i=num;i>0;i=i/10)
        {
            if(i>=10)
            {
                num = (i%10)*10;
            }
            else
            {
                num += i%10;
            }
        }
        System.out.println("The swaped no. is "+num);
    }
}