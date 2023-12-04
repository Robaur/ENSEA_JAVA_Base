import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

import java.io.File;
import java.util.ArrayList;
import java.util.Locale;

public class Game extends Application {
    
    @Override
    public void start(Stage stage) {
        //Group root=new Group();
        //Pane pain = new Pane(root);
        //Scene scene = new Scene(pain,800,400);
        //stage.setScene(scene);
        //stage.show();

        // test Onglet
        //Onglet Stage = new Onglet("YES");
        //Button bob = new Button("bob");
        //Button rick = new Button("Rick");
        //ArrayList<Button> list=new ArrayList<Button>();
        //list.add(rick);
        //list.add(bob);
        //Stage.AddButton(list);
        //pain.getChildren().add(Stage);
        // action
        //Stage.setOnAction(actionEvent->{Stage.PrintButtonList(root);});
        //------------- FULL WORK ------------------------------------//

        //test image
            HBox Hbox= new HBox();
            try{map Map =new map("C:\\Users\\auria\\Git_Project\\ENSEA_JAVA_Base\\RTS\\Sprites\\Background.png");
                Group baby =new Group(Map);
                GameScene SG =new GameScene(baby);
                Map.setViewport(new Rectangle2D(0,0,1000,1000));
                SG.getCam().posX=0;
                SG.getCam().posY=0;

                stage.setScene(SG);
                stage.show();


                SG.setOnKeyPressed(
                        keyEvent -> {System.out.println(keyEvent.getText());
                            if(keyEvent.getText().toUpperCase(Locale.ROOT).equals("Z"))
                            {if(SG.getCam().posY-10!=0){
                                SG.getCam().posY=SG.getCam().posY-10;
                                Map.setViewport(new Rectangle2D(SG.getCam().posX,SG.getCam().posY,1000,1000));
                            }}

                            if(keyEvent.getText().toUpperCase(Locale.ROOT).equals("Q"))
                            {
                                if(SG.getCam().posX-10!=0){
                                    SG.getCam().posX=SG.getCam().posX-10;
                                    Map.setViewport(new Rectangle2D(SG.getCam().posX, SG.getCam().posY,1000,1000));
                                }
                            }
                            if(keyEvent.getText().toUpperCase(Locale.ROOT).equals("S"))
                            {if(SG.getCam().posY+10+SG.getCam().getlongueur()!= Map.getXMax()){
                                SG.getCam().posY=SG.getCam().posY+10;
                                Map.setViewport(new Rectangle2D(SG.getCam().posX,SG.getCam().posY,1000,1000));
                            }}
                            if(keyEvent.getText().toUpperCase(Locale.ROOT).equals("D"))
                            { if(SG.getCam().posX+10+SG.getCam().getlarge()!=0){
                                SG.getCam().posX=SG.getCam().posX+10;
                                Map.setViewport(new Rectangle2D(SG.getCam().posX, SG.getCam().posY,1000,1000));
                            }}


                        }
                        );
            }
            catch(Exception e){
                System.out.println("Shitposter");}
            finally {

            }






    }
    public static void main (String[] args){
        launch(args);
    }
}
