public class Car extends Vehicle {
    String name;
    private int age;
    protected int numberOfWheels = 4;
 
    @Override
    public void start() {
        System.out.print("The car is starting...");
    }
 
    public void move() {
        System.out.print("The car is moving...");
    }

    protected void type() {
        System.out.print("The car type is...");
    }

   public void test() {
        System.out.print("The car is being tested...");
    }
}