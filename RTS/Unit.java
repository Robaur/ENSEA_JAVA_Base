import static java.lang.Thread.*;

import java.util.List;

import javax.swing.text.html.parser.Entity;

public class Unit extends Entities {
    private int Attack;
    protected int Lane;
    private double Range;
    private Entities Target;


    public Unit(String name, int HP, int x, int y, int team, int diameter, String url,
                    int attack, int lane, double range, Entities target) {
        super(name, HP, x, y, team, diameter, url);
        this.Attack = Attack;
        this.Lane = Lane;
        this.Range = Range;
        this.Target = unit_detect(this, activeEntities);
    }

    public void unit_move () throws InterruptedException {
        this.Target=unit_detect(this, activeEntities);
        int x_target=Target.x;
        int y_target=Target.y;
        
        while (x == null) {
        if (Team ==1) {
            int x_limit = 100;//coordonnée x max de la map
            int y_limit = 0;
            switch (Lane) {
                case 0:
                    if (this.y > y_limit) {
                        this.y--;
                    } else if (this.x < x_limit) {
                        this.x++;
                    }
                    break;

                case 1:
                    if (this.x < x_limit) {
                        this.x++;
                    } else if (this.y > y_limit) {
                        this.y--;
                    }

                default:
                    if (this.x < x_limit && this.y > y_limit) {
                        this.y--;
                        this.x++;
                    } else if (this.x < x_limit && this.y == y_limit) {
                        this.x++;
                    } else if (this.x == x_limit && this.y > y_limit) {
                        this.y--;
                    }
                    break;
            }
        }
        else{
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
        }
        this.Target=unit_detect(this,activeEntities);
        x_target=Target.x;
        y_target=Target.y;
    }
        if (this.x>x_target && this.y <y_target){
            this.y++;
            this.x--;
        }
        else if(this.x>x_target && this.y ==y_target){this.x--;}
        else if(this.x==x_target && this.y <y_target){this.y++;}
        else if (this.x<x_target && this.y >y_target){
            this.y--;
            this.x++;
        }
        else if(this.x<x_target && this.y ==y_target){this.x++;}
        else if(this.x==x_target && this.y >y_target){this.y--;}
        else {
            unit_fight(Target);
        }
        this.Target=unit_detect(this,activeEntities);
        x_target=Target.x;
        y_target=Target.y;
    }

    public void unit_fight (Entities target) throws InterruptedException {
        while(this.HP>0) {
            while(this.Target.HP>0) {
                Target.HP = target.HP - this.Attack;
                sleep(100);
            }
        }
        System.out.println("Le combat est fini, le vainqueur est " + Target.Name + ".");
    }


    public Entities unit_detect(Unit unitSource, List<Entities> ListEntities) {
        Entities Target = null;
        double distanceMin = this.Range;
        for (Entities entity : ListEntities) {
            if (entity != unitSource && entity.Team !=this.Team) {
                double distance = unitSource.distance(entity);
                if (distance < distanceMin) {
                    distanceMin = distance;
                    Target = entity;
                }
            }
        }
        return Target;
    }
}
