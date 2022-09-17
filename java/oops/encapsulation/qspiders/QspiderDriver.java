import java.util.Scanner;

public class QspiderDriver {
    public static void main(String []args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("================QSPIDERS==================");
        System.out.print("Enter Branch name :");
        String branchName = s.nextLine();
        
        System.out.print("Enter Student no.  :");
        int nStudents = s.nextInt();
        
        System.out.print("Enter Teacher no.  :");
        int nTeachers = s.nextInt();
        
        Qspider q = new Qspider(branchName, nStudents, nTeachers);
        q.qspiderDetails();

        System.out.println("============UPDATE THE DATA============= :");
        System.out.print("Enter Branch name :");
        branchName = s.next();
        q.setBranchName(branchName);
 
        System.out.print("Enter Student no.  :");
        nStudents = s.nextInt();
        q.setNStudents(nStudents);
        
        q.qspiderDetails();
    }
}
