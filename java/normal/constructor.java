package normal;
import java.util.Scanner;
class A
{
    // static int a=10;
    int a=10;
    // A(int a)
    // {
    //     this.a = a;
    // }
}
class B
{
    public static void main(String [] args)
    {
        A a = new A();
        // System.out.println(A.a);
        Scanner s = new Scanner(System.in);
        a.a= s.nextInt();

        System.out.println(a.a);
    }
}