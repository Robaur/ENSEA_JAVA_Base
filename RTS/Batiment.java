import static java.lang.Thread.*;
import java.io.FileInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Random;
import javafx.scene.image.Image;

public class Batiment extends Entities {
    public Batiment(String name, int HP, int x, int y, int team, int diameter, String url) throws FileNotFoundException {
        super(name, HP, x, y, team, diameter);
        switch (team) {
            case 0:
                this.setImage(url);
            case 1:
                this.setImage(url);
        }
    }

    int Unit_Range = 64;
    int Unit_Atk = 1;
    int Unit_HP = 3;

    public void spawn_unit() {
        Random ran = new Random();
        int Lane = ran.nextInt(3);
        int team = ran.nextInt(2);
        Unit unit = new Unit("bob", Unit_HP,0,0,team,16,"/Sprites/Red_Base",Unit_Atk, Lane, Unit_Range, null);

    }
}