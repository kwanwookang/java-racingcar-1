package racingcar.domain;

import java.util.Random;

public class RandomMovement implements MovementStrategy {
    static final int MOVE_THRES = 4;
    static final int MAX_RAND = 9;

    public boolean isMovable() {
        return (new Random()).nextInt(MAX_RAND + 1) >= MOVE_THRES;
    }
}