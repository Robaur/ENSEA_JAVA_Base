//------------------------------------------------

// THis game is a direct application of the ENSEA java's base




//------------------------------------------------

public class Place {


    public Place(void){
        this.Up=NULL;
        this.Down=NULL;
        this.Left=NULL;
        this.Right=NULL;

        this.ground_type=0;
    }






 //----------------- ALL METHODE TO CHANGE ATTRIBUTE ----------------------------------------------

    public Change_UP (Place New){
        this.Up=New;
    }

    public Change_Down (Place New){
        this.Down=New;
    }

    public Change_Left (Place New){
        this.Left=New;
    }
    public Change_Right (Place New){
        this.Right=New;
    }

    public Change_ground_type(int New){
        this.ground_type=New;
    }

 //-----------------   ATTRIBUTE -------------------------------------------------------------------

    private Place Up;
    private Place Down;
    private Place Left;
    private Place Right;

    private int ground_type;

}