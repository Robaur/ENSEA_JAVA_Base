import static java.lang.Thread.*;

import java.util.List;
import java.util.Random;



public class Batiment extends Entities {


    private final int Unit_Range = 64;
    private final int Unit_Atk = 1;
    private int Unit_HP = 3;
    public Batiment(String name, int HP, int x, int y, int team, int diameter, String url){
        super(name, HP, x, y, team, diameter, url);
    }

    public void spawn_unit() {
        Random ran = new Random();
        Lane = ran.nextInt(3);
        switch (Lane) {
            case 0:
                new_unit = Unit(1, Lane, Unit_Range, getX() );
                break;
            case 1:
                new_unit = Unit(1, Lane, Unit_Range, );
                break;
            case 2:
                new_unit = Unit(1, Lane, Unit_Range, );
                break;
        }
    }
}