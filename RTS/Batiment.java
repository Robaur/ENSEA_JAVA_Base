package RTS;

import static java.lang.Thread.*;

import java.util.List;
import java.util.Random;

int Unit_Range = 64;
int Unit_Atk = 1;
int Unit_HP = 3;


public class Batiment extends Entity {
    public void Batiment(String name, int HP, int x, int y, int team, int diameter){
        this.Name = name;
        this.HP = HP;
        this.x = x;
        this.y = y;
        this.Team = team;
        this.Diameter = diameter;
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