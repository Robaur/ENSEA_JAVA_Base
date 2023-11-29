import org.w3c.dom.Entity;

import java.util.*;
import static java.lang.Thread.sleep;

public class Unit extends Entity {
    private int Attack;
    private int Lane;
    private int Range;
    private Entity Target;

    public Unit(int Attack, int Lane, int Range, Entity Target,int x,int y,str Name,int HP,int team) {
        this.Attack = Attack;
        this.Lane = Lane;
        this.Range = Range;
        this.Target = Target;
        this.x=x;
        this.y=y;
        this.Name=Name;
        this.HP=HP;
        this.team=team;
        //ajouter les variables de entity dedans
    }

    public void unit_move (void){
        int x_target=unit_detect()(1);
        int y_target=unit_detect()(2);
        Random ran = new Random();
        Lane = ran.nextInt(3);
        
        while (x == null || y== null){
        switch (team){
            case 1:
            int x_limit= 100 ;//coordonnée x max de la map
            int y_limit=0;
            switch (Lane){
                case 0:
                if(this.y >y_limit){
                    this.y--;
                }
                else if (this.x<x_limit){
                    this.x++;
                }
                break;

                case 1:
                if(this.x<x_limit){this.x++;}
                else if (this.y >y_limit){this.y--;}

                default:
                if (this.x<x_limit && this.y >y_limit){
                this.y--;
                this.x++;
                }
                else if(this.x<x_limit && this.y ==y_limit){this.x++;}
                else if(this.x==x_limit && this.y >y_limit){ this.y--;}
                break;
            }
            break;

            default:
            int x_limit=0 ;
            int y_limit=100;//coordonnée y max de la map
            switch (Lane){
                case 0:
                if(this.y <y_limit){this.y++;}
                else if (this.x>x_limit){this.x--;}
                break;

                case 1:
                if(this.x>x_limit){this.x--;}
                else if (this.y <y_limit){this.y++;}

                default:
                if (this.x>x_limit && this.y <y_limit){
                this.y++;
                this.x--;
                }
                else if(this.x>x_limit && this.y ==y_limit){this.x--;}
                else if(this.x==x_limit && this.y <y_limit){this.y++;}
                break;
            }
            break;

        }
        x_target=unit_detect()(1);
        y_target=unit_detect()(2);
    }

    
}

    public void unit_fight (Target) throws InterruptedException {
        while(this.HP>0) {
            while(Target.HP>0) {
                Target.HP = Target.HP - this.Attack;
                sleep(100);
            }
        }
        if (this.HP>0) {
            System.out.println("Le combat est fini, le vainqueur est " + this.name + ".");
        }
        else {
            System.out.println("Le combat est fini, le vainqueur est " + Target.name + ".");
        }
    }

    public void unit_detect(){
    }
}
