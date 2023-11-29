import javafx.scene.image.Image;
//
public class Entity {

    //-------------------------------------------- CONSTRUCTOR ---------------------------------------------------------
    public void Entity(){

    }
    public void Entity(String name, int HP,int x,int y,int team, int diameter){
        this.Name=name;
        this.HP=HP;
        this.x=x;
        this.y=y;
        this.Team=team;
        this.Diameter=diameter;
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
    public void setName(String name) {
        this.Name=name;
    }
    public void setTarget(int team) {
        this.Team=team;
    }

    public void setDiameter(int diameter) {
        this.Diameter=diameter;
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

    public Sring getName() {
        return Name;
    }

//-------------------------------------------------- Functions --------------------------------------------------------------

    public void death(){
        if (HP==0){
            System.out.println("L'entité " + Name +" n'existe plus");

        }
    }



 //-------------------------------------------------- VAR --------------------------------------------------------------
    protected str Name;
    protected int HP;
    protected int x;
    protected int y;
    protected int Team;
    private int diameter;
    private Image Sprite;
}

