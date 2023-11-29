import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Camera extends ImageView {
    public Camera(Image face){
        super(face);
    }

    public Camera(String url){
        Image Map = new Image(url);
        super(Map);
    }
}
