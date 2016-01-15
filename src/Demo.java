import java.util.Scanner;
public class Demo {
	public static void main(String[] args){
		int damage;
		  @SuppressWarnings("resource")
		  Scanner dmg = new Scanner(System.in);
	      Soldiers ghost = new Soldiers(4,4000);
	      System.out.println("Your points are : "  +ghost.gethitpoints());
	      System.out.println("Your Current lives are: "  +ghost.getlives());
		      System.out.println("Enter The Damage: or -1 to Quit: ");
		      damage = dmg.nextInt();
		      ghost.setdamage(damage);
		      
		      if(ghost.gethitpoints()>ghost.getdamage())
		      {
			      if(ghost.gethitpoints()>1000||ghost.gethitpoints()==1000){
			    	  System.out.println("Your Damage is: "  +ghost.getdamage());
				      System.out.println("Your Remaining hitpoints is: "  +ghost.takeDamage());
				      //Object is an instance of a class
				      SuperSoldier obj = new SuperSoldier();
				      int num = obj.takeDamage(ghost.getdamage());
				      System.out.println("The soldier receives a damage of: " + num);
			      }
			      else{
			    	  System.out.println("You have less hit points to play the game!!");
			      }
		      }
		      else{
		    	  System.out.println("Your hit points are very low to play");
		    	  System.out.println("The game is exiting....................");
		      }    	      
	}

}
