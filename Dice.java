package DiceGameProgram;

import java.util.Random;
import lombok.*;
@Getter
public class Dice {
    private int faceValue;
    private Random random;

    public Dice() {
        faceValue = 1; 
        random = new Random();
    }

    public void roll() {
        faceValue = random.nextInt(6) + 1;
    }
}
