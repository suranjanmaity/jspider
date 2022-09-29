import java.util.Scanner;
class BankDriver {
    public static void main(String []args)
    {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the bank name : ");
        String bName = s.nextLine();
        System.out.print("Enter the branch name : ");
        String branch = s.nextLine();
        System.out.print("Enter the password : ");
        int pwd = s.nextInt();
        Bank b = new Bank(bName,branch,pwd);
        b.setBname(bName);
        b.setBranch(branch);
        b.setPwd(pwd);

        System.out.println("Bank Details : ");
        b.bankDetails();
    }    
}
