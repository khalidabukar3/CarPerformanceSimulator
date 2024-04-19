public class Car1 extends CarSecondary {

    private int horsepower;
    private int weight;
    private double aerodynamicsCoefficient;

    // Constructor
    public Car1(int horsepower, int weight, double aerodynamicsCoefficient) {
        this.setHorsepower(horsepower);
        this.setWeight(weight);
        this.setAerodynamics(aerodynamicsCoefficient);
    }

    @Override
    public void setHorsepower(int hp) {
        assert hp >= 0 : "Precondition violated: horsepower is non-negative.";
        this.horsepower = hp;
    }

    @Override
    public void setWeight(int weight) {
        assert weight > 0 : "Precondition violated: weight is positive.";
        this.weight = weight;
    }

    @Override
    public void setAerodynamics(double coeff) {
        assert coeff > 0 : "Precondition violated: aerodynamics coefficient is positive.";
        this.aerodynamicsCoefficient = coeff;
    }

    @Override
    public int getHorsepower() {
        return this.horsepower;
    }

    @Override
    public int getWeight() {
        return this.weight;
    }

    @Override
    public double getAerodynamicsCoefficient() {
        return this.aerodynamicsCoefficient;
    }

    // Implement toString() for a basic representation
    @Override
    public String toString() {
        return "Car{horsepower=" + horsepower + ", weight=" + weight + ", aerodynamics=" + aerodynamicsCoefficient + "}";
    } }