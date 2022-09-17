class A
{
    
    char show(){
        System.out.println("hi this is A class");
        return 'k';
    }
}

class B
{

    public static void main(String [] args)
    {
        A a = new A();

        // Scanner s = new Scanner(System.in);
        // a.a= s.nextInt();

        // System.out.println(a.show());
        a.show();
    }
}