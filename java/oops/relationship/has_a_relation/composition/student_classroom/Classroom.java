class Classroom {
    int classroomNo;
    Student s;
    Classroom(int classroomNO,Student s){
        this.classroomNo = classroomNO;
        this.s = s;
    }
    public void classroomDetails()
    {
        System.out.println(classroomNo+" "+s.sName+" "+s.rollno);
    }
}
