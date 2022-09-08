import java.util.Scanner;

public class QspiderDriver {
    public static void main(String []args)
    {
        Scanner s = new Scanner(System.in);
        Qspider q = new Qspider();
        System.out.print("Enter Branch name :");
        String branchName = s.nextLine();
        q.setBranchName(branchName);
        System.out.print("Enter Student no.  :");
        int nStudents = s.nextInt();
        q.setNStudents(nStudents);
        q.qspiderDetails();
    }
}
