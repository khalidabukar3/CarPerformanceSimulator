package components.car;

/**
 * Enhanced interface for Car component with additional behaviors layered on top of the kernel.
 * This interface provides more complex actions that can be performed on or by a Car, utilizing its basic attributes.
 */
public interface Car extends CarKernel {

    /**
     * Calculates and returns the acceleration of this Car based on its attributes.
     * Simplified formula to demonstrate the concept.
     *
     * @return the calculated acceleration
     * @ensures acceleration = some formula involving horsepower, weight, and aerodynamics
     */
    double calculateAcceleration();

    /**
     * Simulates the effect of modifying the car for improved performance.
     * This could represent tuning operations in a game.
     *
     * @updates this.horsepower, this.weight, this.aerodynamics
     * @ensures improved performance metrics
     */
    void tuneForPerformance();

}
