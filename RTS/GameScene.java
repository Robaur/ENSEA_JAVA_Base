import javafx.animation.AnimationTimer;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.application.Application;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.HBox;
import javafx.scene.image.Image;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;


//_________________________________ CONSTRUCTOR

public class GameScene extends Scene{
    public GameScene(Group bob) throws FileNotFoundException {
        super(bob);
        this.Cam=new Camera(1000,1000);


        //test
        Onglet Stage = new Onglet("Batiment");
        Button Bat = new Button("Barracks");
        //Bat.et
        ArrayList<Button> list=new ArrayList<Button>();
        list.add(Bat);
        Stage.AddButton(list);
        bob.getChildren().add(Stage);
        Stage.setOnAction(actionEvent->{Stage.PrintButtonList(bob);});

        ImageView Blue  = new ImageView(new Image(new FileInputStream("C:\\Users\\auria\\Git_Project\\ENSEA_JAVA_Base\\RTS\\Sprites\\Blue_Base.png")));
        Blue.setLayoutY(936);
        Blue.setLayoutX(32);
        bob.getChildren().add(Blue);

        ImageView Red = new ImageView(new Image(new FileInputStream("C:\\Users\\auria\\Git_Project\\ENSEA_JAVA_Base\\RTS\\Sprites\\Red_Base.png")));
        Red.setLayoutY(32);
        Red.setLayoutX(936);
        bob.getChildren().add(Red);

        ImageView BOY = new ImageView(new Image(new FileInputStream("C:\\Users\\auria\\Git_Project\\ENSEA_JAVA_Base\\RTS\\Sprites\\Red_Soldier.png")));
        BOY.setLayoutY(32);
        BOY.setLayoutX(900);
        bob.getChildren().add(BOY);



    }


    public GameScene(HBox bob, int x, int y){
        super(bob,x,y);
        this.Cam=new Camera(1000,1000);
    }

//_____________________________________ GETTERS

    public Camera getCam(){
        return this.Cam;
    }

//______________________________________ OTHERS FUNCTION
    public void layoutMenu(Image brick){
        for(int k=0;k<this.getCam().getlongueur();k++){

        }
    }

   // this.Up.setOnAction(action event->{

    //});
    AnimationTimer timer = new AnimationTimer() {
        @Override

        public void handle(long l) {
            // Camera.update(); update la position de tout les entité bouge
            //lastUpdate= time;
        }
    };
    private Camera Cam;
}
