public class PerformanceTest {
    public static void main(String[] args) {
        Car sportsCar = new Car1(300, 1400, 1.2);
        System.out.println("Sports Car Initial Acceleration: " + sportsCar.calculateAcceleration());
        sportsCar.tuneForPerformance();
        System.out.println("Sports Car Tuned Acceleration: " + sportsCar.calculateAcceleration());
    }
}
