package encapsulation;
import java.util.Scanner;
class BankDriver {
    public static void main(String []args)
    {
        Bank b = new Bank();
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the bank name : ");
        String bName = s.nextLine();
        b.setBname(bName);
        System.out.print("Enter the branch name : ");
        String branch = s.nextLine();
        b.setBranch(branch);
        System.out.print("Enter the password : ");
        int pwd = s.nextInt();
        b.setPwd(pwd);

        System.out.println("Bank Details : ");
        b.bankDetails();
    }    
}
