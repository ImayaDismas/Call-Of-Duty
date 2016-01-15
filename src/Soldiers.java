
public class Soldiers {
	//initializing the properties of the class.
    private int lives;
    private int hitpoints;
    private int damage;
    //constructor
    public Soldiers(int newlives, int newhitpoints){
        lives = newlives;
        hitpoints = newhitpoints;
    }
    //setters
    void setlives(int num){
        lives = num;
    }
    void sethitpoints(int points){
        hitpoints = points;
    }
    void setdamage(int damage){
        this.damage = damage;
    }
    //getters
    public int getlives(){
        return lives;
    }
    public int gethitpoints(){
        return hitpoints;
    }
    public int getdamage(){
        return damage;
    }
    //returns the remaining hitpoints after the damage
    public int takeDamage(){
        int remHitpoints = hitpoints - damage;
        lives-=1;
        return remHitpoints;
    }

}
