import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CarTest {
    private Car car;

    @Before
    public void setUp() {
        car = new Car1(100, 1000, 1.0);  // Example initial setup
    }

    @Test
    public void testAcceleration() {
        double expected = 0.1;  // Expected acceleration based on formula (horsepower / weight) * aerodynamics
        assertEquals("Acceleration should be correctly calculated", expected, car.calculateAcceleration(), 0.01);
    }

    @Test
    public void testSetHorsepower() {
        car.setHorsepower(150);
        assertEquals("Horsepower should update correctly", 150, car.getHorsepower());
    }

    @Test
    public void testSetWeight() {
        car.setWeight(1200);
        assertEquals("Weight should update correctly", 1200, car.getWeight());
    }

    @Test
    public void testSetAerodynamics() {
        car.setAerodynamics(1.2);
        assertEquals("Aerodynamics should update correctly", 1.2, car.getAerodynamicsCoefficient(), 0.01);
    }
}