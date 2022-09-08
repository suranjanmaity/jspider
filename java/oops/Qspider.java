public class Qspider {
    private String branchName;
    private int nStudents;
    private int nTeachers = 10;
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
        System.out.println(getBranchName()+" "+getNTeachers());
    }
}