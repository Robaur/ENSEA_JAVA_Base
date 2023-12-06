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
    String pwd = System.getProperty("user.dir");
    public GameScene(Group bob) throws FileNotFoundException {
        super(bob);
        this.Cam=new Camera(1000,1000);


        //test
        Onglet Stage = new Onglet("Batiment");
        Button Bat = new Button("Barracks");
        ArrayList<Button> list=new ArrayList<Button>();
        list.add(Bat);
        Stage.AddButton(list);
        bob.getChildren().add(Stage);
        Stage.setOnAction(actionEvent->{Stage.PrintButtonList(bob);});

        Batiment RedCastel = new Batiment("Red",5,32,936,0,5,pwd+"\\RTS_vr\\Sprites\\Red_Base_S.png",3,pwd+"\\RTS_vr\\Sprites\\Red_Soldier.png");
        RedCastel.Plotter(bob);


        Batiment BlueCastel = new Batiment("Red",5,936,32,1,5,pwd+"\\RTS_vr\\Sprites\\Blue_Base_S.png",3,pwd+"\\RTS_vr\\Sprites\\Red_Soldier.png");
        BlueCastel.Plotter(bob);




        Unit BlueBoy = new Unit("Red",5,936,32,1,5,pwd+"\\RTS_vr\\Sprites\\Blue_Soldier.png",2,0,5.0,RedCastel,1);
        BlueBoy.Plotter(bob);



        Bat.setOnAction(actionEvent -> {
            clic =1;

                bob.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override

                    public void handle(MouseEvent mouseEvent) {
                        ImageView Blue  = null;
                        if(clic==1) {
                            try {
                                Blue = new ImageView(new Image(new FileInputStream(pwd+"\\RTS_vr\\Sprites\\Blue_Base.png")));
                                System.out.println(RedCastel.getNbSprite());
                                bob.getChildren().remove(RedCastel.getSprite());
                                RedCastel.IncrementationSprite();
                                System.out.println(RedCastel.getNbSprite());
                                RedCastel.Plotter(bob);
                            } catch (FileNotFoundException e) {
                                throw new RuntimeException(e);
                            }

                            Blue.setLayoutY(mouseEvent.getSceneY());
                            Blue.setLayoutX(mouseEvent.getSceneX());
                            bob.getChildren().add(Blue);
                            clic=0;
                        }
                }

                });



        });

        AnimationTimer timer = new AnimationTimer() {
            @Override

            public void handle(long l) {
              update(bob); //update la position de tout les entité bouge

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

 public void  update(Group bob){
            for(Entities e:Entities.activeEntities){
                e.Update(bob);
            }

            }



    private Camera Cam;
    public int clic;
}
