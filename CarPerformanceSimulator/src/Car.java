public class Car {
    private double horsepower;
    private double weight;
    private int gear;
    private final double aerodynamics;

    // Constructor
    
    public Car(double horsepower, double weight, double aerodynamics) {
        
        this.horsepower = horsepower;
        this.weight = weight;
        this.aerodynamics = aerodynamics;
        
        // Default starting gear
        this.gear = 1; 
    }

    // Method to simulate changing gears
    public void changeGear(int newGear) {
        if(newGear > 0 && newGear <= 6) { 
            gear = newGear;
            System.out.println("Gear changed to: " + gear);
        } else {
            System.out.println("Invalid gear. Please select between 1 and 6.");
        }
    }

    // Calculate acceleration based on current gear
    public double calculateAcceleration() {
        double accelerationFactor = 0.1 * gear; 
        double acceleration = (horsepower / weight) * aerodynamics * accelerationFactor;
        return acceleration;
    }

    // Main method for demonstration
    public static void main(String[] args) {
        
        Car myCar = new Car(300, 1500, 1.05);
        System.out.println("Initial Acceleration: " + myCar.calculateAcceleration() + " m/s^2");
        
        myCar.changeGear(3);        
        System.out.println("Acceleration in 3rd Gear: " + myCar.calculateAcceleration() + " m/s^2");
    }
}
