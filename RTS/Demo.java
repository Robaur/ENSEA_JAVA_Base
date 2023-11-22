import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;

import java.util.Locale;

public class Demo extends Application {
    @Override
    public void start(Stage stage) {
        Group root=new Group();
        Scene scene = new Scene(root,800,400);
        stage.setScene(scene);
        stage.show();
        Label label = new Label("Bonjour");
        label.setLayoutX(350);
        label.setLayoutY(150);
        Button button = new Button("OK");
        root.getChildren().add(label);
        root.getChildren().add(button);

        button.setOnAction(actionEvent -> {
            System.out.println("Click");
            label.getTransforms().add(
                    new Rotate(90,label.getWidth()/2,label.getHeight()/2));
        });

        scene.setOnKeyPressed(keyEvent -> {
            System.out.println(keyEvent.getText());
            if(keyEvent.getText().toUpperCase(Locale.ROOT).equals("R")){
                label.getTransforms().add(
                        new Rotate(-90,label.getWidth()/2,label.getHeight()/2));

            }
        });

    }


    public static void main (String[] args){
        launch(args);
    }
}
