package relationship.has_a_relation.composition.engine_car;
public class CarDriver {
    public static void main(String []args)
    {
        Car c = new Car("Audi", new Engine(1300, 397));
        c.carDetails();
    }
}
