package project.car;

import javax.smartcardio.CardException;

public class Car {


    private int speed;

    public void increaseSpeed() throws CardException {
        speed += 70;
        if (speed > 200) {
            throw new CardException("Car crashed");
        }
    }

}

