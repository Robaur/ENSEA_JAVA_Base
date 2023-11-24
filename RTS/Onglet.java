import javafx.scene.control.Button;
import javafx.scene.control.Label;
import java.util.ArrayList;
import javafx.scene.Group;
import java.util.ArrayList;

public class Onglet extends Button{
    public Onglet(String bob){
        super(bob);
    }

    public void AddButton(Button Newbut){
        this.ButtonList.add(Newbut);
    }

    public void AddButton(ArrayList<Button> List){
        int index=0;

        while(index!=-1){
            try{
            this.ButtonList.add(List.get(index));
            index++;}
            catch(Exception e){
                index=-1;}
        }

    }

    // BIG FUNCTION FOR PRINT ALL THE BUTTONS SOCKED IN
    public void PrintButtonList(Group base){
        int index=0;
        if(Printed){
        while(index!=-1){
            try{
                this.ButtonList.get(index).setLayoutY(this.getLayoutY()+(index+1)*50);
                base.getChildren().add(this.ButtonList.get(index));
                index++;
                }
            catch(Exception e){
                index=-1;
                }

        }
        this.ChangePrinted();
        }
        else{
            while(index!=-1){
                try{
                    base.getChildren().remove(this.ButtonList.get(index));
                    index++;
                }
                catch(Exception e){
                    index=-1;
                }
                            }
            }
        this.ChangePrinted();
    }


    public void ChangePrinted(){
        if(this.Printed){this.Printed=false;}
        else{this.Printed=true;}
    }

    ArrayList<Button> ButtonList = new ArrayList();
        private boolean Printed;
}
