import java.util.Scanner;
class Assignment18 {
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        Laptop l = new Laptop();
        System.out.println("\nBefore passing values");
        l.laptopDriver();

        System.out.println("\nEnter the brand name : ");
        l.brand = s.nextLine();
        System.out.println("Enter the model name : ");
        l.model = s.nextLine();
        System.out.println("Enter the price : ");
        l.price = s.nextInt();

        System.out.println("\nAfter passing values");
        l.laptopDriver();
    }
}
class Laptop{
    String model;
    String brand;
    int price;
    Laptop()
    {
        this("MacBook Air");
    }
    Laptop(String model)
    {
        this("Apple", 80000);
        this.model = model;
    }
    Laptop(String brand, int price)
    {
        this.brand = brand;
        this.price = price;
    }
    public void laptopDriver()
    {
        System.out.println("Barnd : "+brand+"\nModel :"+model+"\nPrice "+price);
    }
}