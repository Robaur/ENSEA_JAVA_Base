package RTS;

import static java.lang.Thread.*;
import javafx;
import java.util.List;
import java.util.Random;

public class Batiment extends Entity {
    public Batiment(String name, int HP, int x, int y, int team, int diameter, Image Sprite) {
        this.Name = name;
        this.HP = HP;
        this.x = x;
        this.y = y;
        this.Team = team;
        this.Diameter = diameter;
        switch (team) {
            case 0:
                this.Sprite = new Image("Red_Base");
            case 1:
                this.Sprite = new Image("Blue_Base");
        }
    }

    int Unit_Range = 64;
    int Unit_Atk = 1;
    int Unit_HP = 3;

    public void spawn_unit() {
        Random ran = new Random();
        int Lane = ran.nextInt(3);
        Unit unit = new Unit(Unit_Atk, Lane, Unit_Range, null, x - 32, y + 32, "Roger", Unit_HP, 0);

    }
}