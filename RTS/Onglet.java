import javafx.scene.control.Button;
import javafx.scene.control.Label;
import java.util.ArrayList;
import javafx.scene.Group;
import java.util.ArrayList;

public class Onglet extends Button{
    public Onglet(String bob){
        super(bob);
        Printed=false;
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
        boolean end=false;
        if(!Printed){
            while(!end){
                try{
                    this.ButtonList.get(index).setLayoutY(this.getLayoutY()+(index+1)*20);
                    base.getChildren().add(this.ButtonList.get(index));
                    index++;
                    }
                catch(Exception e){
                    end=true;
                    }

            }
            }
        else{
            while(!end){
                try{
                    base.getChildren().remove(this.ButtonList.get(index));
                    index++;
                }
                catch(Exception e){
                    end=true;
                }
            }
            }
        this.ChangePrinted();
        System.out.println('N');
    }


    public void ChangePrinted(){
        this.Printed= !this.Printed;
    }

    ArrayList<Button> ButtonList = new ArrayList();
        private boolean Printed;
}
