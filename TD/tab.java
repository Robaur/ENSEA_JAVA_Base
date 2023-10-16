//------------------------------------------------

// THis game is a direct application of the ENSEA java's base




//------------------------------------------------


public class tab {
    public tab{
        this.size=5;
        this.T_case=Place[(this.size)*(this.size)];
        for (int k; k<(this.size*this.size); k++){
            this.T_case= new Place();
        }

    }


    public Place[] T_case;
    private int size;
}