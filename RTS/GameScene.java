import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.application.Application;
public class GameScene extends Scene{
    public GameScene(Group bob){
        super(bob);
        this.Cam=new Camera(1000,1000);
    }




    public Camera getCam(){
        return this.Cam;
    }
   // this.Up.setOnAction(action event->{

    //});

    private Camera Cam;
}
