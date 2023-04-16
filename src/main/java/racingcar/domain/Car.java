package racingcar.domain;

import java.util.Random;

public class Car {
    private String name;
    private int position;

    public Car(String name) {
        this(name, 0);
    }

    public Car(String name, int position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public void move() {
        if (getRandom() > 4) {
            position++;
        }
    }

    protected int getRandom() {
        return new Random().nextInt(10);
    }


}
