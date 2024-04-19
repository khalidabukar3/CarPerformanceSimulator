package components.car;

/**
 * Implements the secondary methods for the Car component based on the CarKernel interface.
 */

public abstract class CarSecondary implements Car {

    @Override
    public double calculateAcceleration() {
        // Assuming acceleration calculation depends on horsepower, weight, and aerodynamics
        return getHorsepower() / (getWeight() * getAerodynamics());
    }

    @Override
    public void tuneForPerformance() {
        // Increase horsepower and improve aerodynamics for tuning operation
        setHorsepower(getHorsepower() + 50); // Increase horsepower by 50
        setAerodynamics(getAerodynamics() * 1.1); // Improve aerodynamics by 10%
    }

    @Override
    public String toString() {
        // a string representation of the Car object
        return "Car[Horsepower: " + getHorsepower() + ", Weight: " + getWeight() + ", Aerodynamics: " + getAerodynamics() + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Car)) {
            return false;
        }
        Car other = (Car) obj;
        return this.getHorsepower() == other.getHorsepower() &&
               this.getWeight() == other.getWeight() &&
               Double.compare(this.getAerodynamics(), other.getAerodynamics()) == 0;
    }
}

