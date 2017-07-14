
//Use loops to make the finch dance/trace the pattern I drew (sort of) on the board. Save your work as GeoPattern.java

/*{	|_| ___|_|
//	   |     |
//	 _|___|_
//	|_|      |_|
	} */
	//try to do a basic square, first, then do loops.
	//public Finch();
	//public void setWheelVelocitites(int leftVelocity, int rightVelocity, int timeToHold);
	//public void stopWheels();

	//Raver.setWheelVelocities( 10, 42, 2000);  //ugh this should just be a loop.
	//Raver.setWheelVelocities( 33, 33, 5000);	//Raver.setWheelVelocities( -33, -33, 5000);//back
	
package Code.Users\Clear Thinking\Documents\Notepad++Portable\GeoPattern.java
	
import edu.cmu.ri.createlab.terk.robot.finch.Finch;	
import java.util.*;

public class GeoPattern{

	public static void main(String[] args){

		Finch Raver = new Finch();
		String Square = (0,2,1,3);
		String Corners = (0,1,2,3);
		
		if (Square<4) {
			
		Raver.setWheelVelocities( 33, 33, 5000); //over
			Raver.setWheelVelocities( 10, 42, 2000);
			Raver.stopWheels();
		++Square;
			
		} for (Corners<4) {
			Raver.setWheelVelocities( 17, 17, 2000);
			Raver.setWheelVelocities( 5, 21, 2000);
				Raver.stopWheels();
				++Corners;
		}
		
			Raver.quit();
			System.exit();
	}
}
	
	
	
	
	
	
	
	
	
	
	
}