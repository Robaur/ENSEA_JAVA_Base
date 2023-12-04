
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;



public class Camera {
    public Camera(int x,int y){
        large=x;
        longueur=y;
    }


    //-------------------------- GETTER -------------------------------

    @Override
    public String toString(){
        System.out.println(this.getlarge()+'\n'+this.getlongueur());
        return("bite");
    }

    public int getlarge() {
        return large;
    }
    public int getlongueur(){
        return longueur;
    }

    //-------------------------- ATTRIBUTE ------------------------------
    private int large;
   private  int longueur;
   public int posX;
   public int posY;
}
