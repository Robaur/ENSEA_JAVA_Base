import javafx.animation.AnimationTimer;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.application.Application;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
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
        String pwd = System.getProperty("user.dir");
        Onglet Stage = new Onglet("Batiment");
        Button Bat = new Button("Barracks");
        ArrayList<Button> list=new ArrayList<Button>();
        list.add(Bat);
        Stage.AddButton(list);
        bob.getChildren().add(Stage);
        Stage.setOnAction(actionEvent->{Stage.PrintButtonList(bob);});

        Batiment RedCastel = new Batiment("Red",5,936,32,0,5,pwd+"\\RTS\\Sprites\\Blue_Base.png");


       ImageView LayRedCastel  = new ImageView(RedCastel.getSprite());
        LayRedCastel.setLayoutY(936);
        LayRedCastel.setLayoutX(32);
        bob.getChildren().add(LayRedCastel);

        ImageView Red = new ImageView(new Image(new FileInputStream(pwd+"\\RTS\\Sprites\\Red_Base.png")));
        Red.setLayoutY(32);
        Red.setLayoutX(936);
        bob.getChildren().add(Red);

        ImageView BOY = new ImageView(new Image(new FileInputStream(pwd+"\\RTS\\Sprites\\Red_Soldier.png")));
        BOY.setLayoutY(32);
        BOY.setLayoutX(900);
        bob.getChildren().add(BOY);


        Bat.setOnAction(actionEvent -> {
            boolean state =true;
            if(state){
                bob.setOnMouseClicked(new EventHandler<MouseEvent>() {

                    @Override

                    public void handle(MouseEvent mouseEvent) {
                        ImageView Blue  = null;
                            try {
                                Blue = new ImageView(new Image(new FileInputStream(pwd+"\\RTS\\Sprites\\Blue_Base.png")));
                            } catch (FileNotFoundException e) {
                                throw new RuntimeException(e);
                            }
                        Blue.setLayoutY(mouseEvent.getSceneY());
                        Blue.setLayoutX(mouseEvent.getSceneX());
                        bob.getChildren().add(Blue);

                }

                });
                state=false;
            }

        });

        AnimationTimer timer = new AnimationTimer() {
            @Override

            public void handle(long l) {
              //  this.update(); //update la position de tout les entité bouge
            }
        };
        timer.start();


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

 //   public Update(){

   // }


    private Camera Cam;

}
