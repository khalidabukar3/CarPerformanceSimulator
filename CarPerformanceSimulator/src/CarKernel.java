package components.car;

import components.standard.Standard;

/**
 * Kernel interface for Car component providing the minimal functionality expected of a Car.
 * This interface includes basic properties and actions that define a car's state and behavior.
 *
 * @mathmodel type CarKernel is modeled by (horsepower: integer, weight: integer, aerodynamics: real)
 * @initially <pre>
 * ():
 *  ensures
 *   this.horsepower = 0 and this.weight = 0 and this.aerodynamics = 1.0;
 * </pre>
 */
public interface CarKernel extends Standard<Car> {

    /**
     * Sets the horsepower of this Car.
     *
     * @param hp
     *            the horsepower to set
     * @updates this.horsepower
     * @ensures this.horsepower = hp
     */
    void setHorsepower(int hp);

    /**
     * Sets the weight of this Car.
     *
     * @param weight
     *            the weight to set
     * @updates this.weight
     * @ensures this.weight = weight
     */
    void setWeight(int weight);

    /**
     * Sets the aerodynamics coefficient of this Car.
     *
     * @param coeff
     *            the aerodynamics coefficient to set
     * @updates this.aerodynamics
     * @ensures this.aerodynamics = coeff
     */
    void setAerodynamics(double coeff);
    
   
}