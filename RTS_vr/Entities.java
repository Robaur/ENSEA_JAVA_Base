import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.Group;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

//
public abstract class Entities {

    //-------------------------------------------------- VAR --------------------------------------------------------------
    protected String Name;
    protected int HP;
    protected int x;
    protected int y;
    protected int Team;
    protected int Diameter;
    private ImageView Sprite;
    private int nbSprite;
    private int SpriteStat;
    public static List<Entities> activeEntities = new ArrayList<>();

    //-------------------------------------------- CONSTRUCTOR ---------------------------------------------------------
    public Entities(String name, int HP, int x, int y, int team, int diameter, String url,int nbSprite)  {
        this.Name = name;
        this.HP = HP;
        this.x = x;
        this.y = y;
        this.Team = team;
        this.Diameter = diameter;
        try{this.Sprite = new ImageView(new Image( new FileInputStream(url)));}
        catch(Exception e){System.out.println(e);}
        this.nbSprite=nbSprite;
        activeEntities.add(this);
        this.SpriteStat=0;
        this.IncrementationSprite();
    }
    public Entities(String name, int HP, int x, int y, int team, int diameter,int nbSprite) {
        this.Name = name;
        this.HP = HP;
        this.x = x;
        this.y = y;
        this.Team = team;
        this.Diameter = diameter;
        this.nbSprite=nbSprite;
        activeEntities.add(this);
    }



    //----------------------------------------------- SETTER -----------------------------------------------------------


    public void setHP(int HP) {
        this.HP = HP;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setImage(String url) throws FileNotFoundException {
        Image face = new Image(new FileInputStream(url));
        this.Sprite = new ImageView(face);
        this.SpriteStat=0;
        this.IncrementationSprite();
    }

    public void setName(String name) {
        this.Name = name;
    }

    public void setTarget(int team) {
        this.Team = team;
    }

    public void setDiameter(int diameter) {
        this.Diameter = diameter;
    }

    public void setNbSprite(int nbSprite){this.nbSprite=nbSprite;}
    public void setSpriteStat(int SpriteStat){this.SpriteStat=SpriteStat;}

    //------------------------------------------------GETTER -----------------------------------------------------------
    public int getHP() {
        return HP;
    }

    public int getTeam() {
        return Team;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getName() {
        return Name;
    }

    public int getDiameter() {
        return Diameter;
    }

    public ImageView getSprite(){ return Sprite;}

    public int getNbSprite(){return this.nbSprite;}
    public int getSpriteStat(){return this.SpriteStat;}


//-------------------------------------------------- METHOD --------------------------------------------------------------

    public double distance(Entities autreEntity) {
        return Math.sqrt(Math.pow(autreEntity.x - this.x, 2) + Math.pow(autreEntity.y - this.y, 2));
    }

    public void death() {
        if (this.HP == 0) {
            if (this.Diameter == 16) {
                System.out.println(this.Name + "is dead.");
            }
            if (this.Diameter == 32) {
                System.out.println(this.Name + "is destroyed.");
            }
            activeEntities.remove(this);
        }
    }

    public void Plotter(Group Bord){
        this.Sprite.setLayoutY(this.y);
        this.Sprite.setLayoutX(this.x);
        Bord.getChildren().add(this.Sprite);

    }

    public void IncrementationSprite(){
        this.Sprite.setViewport(new Rectangle2D(32*this.getSpriteStat(),0,32,32));
        //System.out.println("ok");
        this.setSpriteStat(this.SpriteStat+1);
        if(this.SpriteStat==this.nbSprite){this.setSpriteStat(0);}
    }

    public void Update(Group bob){
        this.death();
        bob.getChildren().remove(this.getSprite());
        if(this.HP>0) {
            IncrementationSprite();
            this.Plotter(bob);
        }
    }
    public static Entities ReturnRightNexus(int Team){
        for(Entities e:activeEntities){
            if(e.Name=="Red_Nexus" && e.Team==Team){return(e);};
            if(e.Name=="Blue_Nexus" && e.Team==Team){return(e);};
        }
        return(null);
    }



}
