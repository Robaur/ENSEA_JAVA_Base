import javafx.scene.image.Image;
//
public class Entity {

    //-------------------------------------------- CONSTRUCTOR ---------------------------------------------------------
    public void Entity(){

    }
    public void Entity(String name, int HP,int x,int y,int team){
        this.Name=name;
        this.HP=HP;
        this.x=x;
        this.y=y;
        this.Team=team;
    }

    public void Entity (String name, String url){
        this.Name=name;
        this.Sprite= new Image(url);
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
    public void setImage(String url){
        Image face=new Image(url);
        this.Sprite=face;

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












 //-------------------------------------------------- VAR --------------------------------------------------------------
    private String Name;
    private int HP;
    private int x;
    private int y;

    private int Team;
    private Image Sprite;
}
