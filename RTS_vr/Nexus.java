import java.io.FileInputStream;
import javafx.scene.Group;

public class Nexus extends Entities{
    public Nexus(String name, int HP, int x, int y, int team, int diameter, String url,int nbSprite){
        super(name, HP, x, y, team, diameter,nbSprite);
        try{this.setImage(new FileInputStream(url).toString());}
        catch(Exception e){System.out.println(e);}
    }

    public void end_games(){
        if (this.HP == 0) {
        }
    }

    @Override
    public void Update(Group bob) {

    }
}
