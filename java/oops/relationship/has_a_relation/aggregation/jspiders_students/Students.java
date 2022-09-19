public class Students {
    String sName;
    int idNo;
    Jspiders j;
    Students(String sName, int idNo)
    {
        this.sName = sName;
        this.idNo = idNo;
    }
    public void studentsDetails(Jspiders j)
    {
        System.out.println(sName+" "+idNo+" "+j.getBname());
    }
}
