public class Nexus extends Entities{
    public Nexus(String name, int HP, int x, int y, int team, int diameter, String url){
        super(name, HP, x, y, team, diameter, url);
    }

    public void end_games(){
        if (this.HP == 0) {
        }
    }
}
