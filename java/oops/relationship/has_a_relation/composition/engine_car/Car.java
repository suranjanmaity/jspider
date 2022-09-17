class Car {
    String carModel;
    Engine e;
    Car(String carModel, Engine e)
    {
        this.carModel = carModel;
        this.e = e;
    }
    public void carDetails()
    {
        System.out.println(carModel + " " + e.cc + " " + e.engNo);
    }
}
