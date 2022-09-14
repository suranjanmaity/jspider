import java.util.Scanner;
class Factors
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any number to find its factor :");
        int num = s.nextInt();
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            System.out.print(i+" ");
        }
    }
}