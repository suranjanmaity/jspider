class Bank {
    
    private String bName;
    private String branch;
    private int pwd=10;
    Bank(String bName,String branch, int pwd)
    {
        this.bName = bName;
        this.branch=branch;
        this.pwd=pwd;
    }
    public String getBname()
    {
        return bName;
    }
    public void setBname(String bName)
    {
        this.bName = bName;
    }

    public String getBranch()
    {
        return branch;
    }
    public void setBranch(String branch)
    {
        this.branch = branch;
    }

    public void setPwd(int pwd)
    {
        this.pwd = pwd;
    }
    public void bankDetails()
    {
        System.out.println(getBname()+"\n"+getBranch());
    }
}
