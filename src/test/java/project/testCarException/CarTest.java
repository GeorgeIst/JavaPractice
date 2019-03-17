package project.testCarException;

import org.junit.Test;
import project.car.Car;

import javax.smartcardio.CardException;


public class CarTest {
    @Test
    public void carTest() {
        Car c = new Car();
        try {
            c.increaseSpeed();
            c.increaseSpeed();
            c.increaseSpeed();
        } catch (CardException e) {
            e.printStackTrace();
        }


    }

}
