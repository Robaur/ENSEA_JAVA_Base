import org.w3c.dom.Entity;

import java.util.*;
import static java.lang.Thread.sleep;

public class Unit extends Entity {
    private int Attack;
    private int Lane;
    private int Range;
    private Entity Target;

    public Unit(int Attack, int Lane, int Range, Entity Target) {
        this.Attack = Attack;
        this.Lane = Lane;
        this.Range = Range;
        this.Target = Target;
        this.x=0;
        this.y=0;
        this.name="";
        this.PV=100;
        //ajouter les variables de entity dedans
    }

    public void unit_move (x, y,Target){
        int x_final=Target.x;
        int y_final=Target.y;
        Random ran = new Random();
        Lane = ran.nextInt(3);
        if (Lane==0) {

        }
        else if (Lane==1) {
            // si pas de bord: on fait x=x+1 sinon on fait y=y-1
        }
        else {
        }
        // code pour déplacer une unité sur une case en fonction du target
    }

    public void unit_fight (Target) throws InterruptedException {
        while(this.PV>0) {
            while(Target.PV>0) {
                Target.PV = Target.PV - this.Attack;
                sleep(100);
            }
        }
        if (this.PV>0) {
            System.out.println("Le combat est fini, le vainqueur est " + this.name + ".");
        }
        else {
            System.out.println("Le combat est fini, le vainqueur est " + Target.name + ".");
        }
    }

    public void unit_detect(){
        if
        }
    }
}
