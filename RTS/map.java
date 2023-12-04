import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.io.FileInputStream;
import java.io.IOException;


import java.io.File;
import java.io.FileInputStream;

public class map extends ImageView {
    public map(String url) throws IOException{
        super(new Image(new FileInputStream(url)));
        XMax=getX();
        YMax=getY();
    }
    public map(Image Im){super(Im);}
    public double getXMax(){
        return(this.XMax);
    }
    public double getYMax(){
        return(this.YMax);
    }

private double XMax;
    private double YMax;

}
