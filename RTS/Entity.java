package RTS;

import javafx.scene.image.Image;
import java.util.ArrayList;
import java.util.List;

//
public class Entity {

    //-------------------------------------------------- VAR --------------------------------------------------------------
    protected String Name;
    protected int HP;
    protected int x;
    protected int y;
    protected int Team;
    protected int Diameter;
    private Image Sprite;

    protected static List<Entity> activeEntities = new ArrayList<>();

    //-------------------------------------------- CONSTRUCTOR ---------------------------------------------------------
    public void Entity(String name, int HP, int x, int y, int team, int diameter) {
        this.Name = name;
        this.HP = HP;
        this.x = x;
        this.y = y;
        this.Team = team;
        this.Diameter = diameter;
        activeEntities.add(this);
    }

    public void Entity(String name, String url) {
        this.Name = name;
        this.Sprite = new Image(url);
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

    public void setImage(String url) {
        Image face = new Image(url);
        this.Sprite = face;
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

//-------------------------------------------------- METHOD --------------------------------------------------------------

    public double distance(Entity autreEntity) {
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
}
