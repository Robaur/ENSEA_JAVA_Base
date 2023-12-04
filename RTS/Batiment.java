import static java.lang.Thread.*;
import java.util.List;
import java.util.Random;
import javafx.scene.image.Image;

public class Batiment extends Entities {
    public Batiment(String name, int HP, int x, int y, int team, int diameter, String url) {
        super(name, HP, x, y, team, diameter, url);
        switch (team) {
            case 0:
                this.Sprite = new Image("/Sprites/Red_Base");
            case 1:
                this.Sprite = new Image("/Sprites/Blue_Base");
        }
    }

    int Unit_Range = 64;
    int Unit_Atk = 1;
    int Unit_HP = 3;

    public void spawn_unit() {
        Random ran = new Random();
        int Lane = ran.nextInt(3);
        int team = ran.nextInt(2);
        Unit unit = new Unit("bob", Unit_HP,0,0,team,Unit_diameter,"/Sprites/Red_Base",Unit_Atk, Lane, Unit_Range, null);

    }
}