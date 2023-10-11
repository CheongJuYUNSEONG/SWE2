package DiceGameProgram;
import lombok.*;
@Getter
@Setter
public class Player {
    private String name;
    private int win;
    Player(){
    	win=0;
    }
}
