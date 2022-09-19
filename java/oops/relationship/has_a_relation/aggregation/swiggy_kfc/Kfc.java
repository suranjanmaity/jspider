class Kfc {
    String name;
    String location;
    Swiggy s;
    Kfc(String name, String location)
    {
        this.name = name;
        this.location = location;
    }
    public void kfcDetails(Swiggy s)
    {
        System.out.println(name+" "+location+" "+s.location+" "+s.orderNo);
    }
}
