public class CarComparison {
    public static void main(String[] args) {
        Car familyCar = new Car1(120, 1500, 0.9);
        Car suv = new Car1(200, 2000, 0.8);

        System.out.println("Family Car Acceleration: " + familyCar.calculateAcceleration());
        System.out.println("SUV Acceleration: " + suv.calculateAcceleration());
    }
}