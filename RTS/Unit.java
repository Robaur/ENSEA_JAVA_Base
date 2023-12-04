package RTS;

import java.util.*;
import static java.lang.Thread.sleep;

public class Unit extends Entity {
    private int Attack;
    private int Lane;
    private double Range;
    private Entity Target;


    public Unit(int Attack, int Lane, double Range, Entity Target,int x,int y, String name,int HP,int team) {
        this.Attack = Attack;
        this.Lane = Lane;
        this.Range = Range;
        this.Target = unit_detect(this, activeEntities);
        this.x=x;
        this.y=y;
        this.Name=name;
        this.HP=HP;
        this.Team= team;
    }

    public void unit_move () throws InterruptedException {
        this.Target=unit_detect(this, activeEntities);
        int x_target=Target.x;
        int y_target=Target.y;
        Random ran = new Random();
        Lane = ran.nextInt(3);
        
        while (x = null){
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

<<<<<<< HEAD
    public void unit_fight (Target) throws InterruptedException {
=======
    public void unit_fight (Entity target) throws InterruptedException {
>>>>>>> 76ef09a38d413e71f985f3986144ac4d43cb1118
        while(this.HP>0) {
            while(this.Target.HP>0) {
                Target.HP = target.HP - this.Attack;
                sleep(100);
            }
        }
        System.out.println("Le combat est fini, le vainqueur est " + Target.Name + ".");
    }


    public Entity unit_detect(Unit unitSource, List<Entity> ListEntities) {
        Entity Target = null;
        double distanceMin = this.Range;
        for (Entity entity : ListEntities) {
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
