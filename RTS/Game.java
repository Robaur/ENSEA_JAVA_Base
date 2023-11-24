import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;

import java.util.ArrayList;
import java.util.Locale;

public class Game extends Application {
    
    @Override
    public void start(Stage stage) {
        Group root=new Group();
        Scene scene = new Scene(root,800,400);
        stage.setScene(scene);
        stage.show();

        // test Onglet
        Onglet Stage = new Onglet("YES");
        Button bob = new Button("bob");
        Button rick = new Button("Rick");
        ArrayList<Button> list=new ArrayList<Button>();
        list.add(rick);
        list.add(bob);
        Stage.AddButton(list);
        root.getChildren().add(Stage);

        Stage.setOnAction(actionEvent->{Stage.PrintButtonList(root);});


    }
    public static void main (String[] args){
        launch(args);
    }
}
