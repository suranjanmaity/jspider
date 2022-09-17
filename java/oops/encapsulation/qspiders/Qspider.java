public class Qspider {
    private String branchName;  //w r
    private int nStudents;      //w
    private int nTeachers; //  r
    
    Qspider(String branchName, int nStudents, int nTeachers)
    {
        this.branchName = branchName;
        this.nStudents = nStudents;
        this.nTeachers = nTeachers;
    }
    public String getBranchName()
    {
        return branchName;
    }
    public void setBranchName(String branchName)
    {
        this.branchName = branchName;
    }

    public void setNStudents(int nStudents)
    {
        this.nStudents = nStudents;
    }
    public int getNTeachers()
    {
        return nTeachers;
    }
    public void qspiderDetails()
    {
        System.out.println("Branch :" +getBranchName()+" Teacher no : "+getNTeachers());
    }
}