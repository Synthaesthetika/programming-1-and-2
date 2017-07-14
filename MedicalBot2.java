
//MedicalBot2: use loops to intake integers.

package Code.Users\Clear Thinking\Documents\Notepad++Portable\MedicalBot2.java

import edu.cmu.ri.createlab.terk.robot.finch.Finch;
import java.util.*;

public class MedicalBot{

	public static void main(String[] args) {
	
		Finch Raver = new Finch();
		Scanner keyboard = new Scanner(System.in);
		double celsius = Raver.getTemperature();
		double fahrenheit = celsius*1.8+32;
		String Ans = "yes";
		
		do {
			
		
		if((fahrenheit > 76)&& fahrenheit < 80)) {
			Raver.saySomething("Green: You're at room temperature.");
			Raver.setLED(0,255,0,5000);
		} else if (fahrenheit < 76) {
			Raver.saySomething("Blue: You're below room temperature. It's cold!");
			Raver.setLED(0,0,255,5000);
		} else {
			Raver.saySomething("Red: You're above room temperature. It's hot!");
			Raver.setLED(255.0,0,5000);
		}
		
			Raver.saySomething("I'd like to take your temperature. Would you like to continue? yes/no");
			Ans = input.next();
		
		} while (Ans.equals("yes")) {
		}
		
		Raver.quit();
		System.exit(0);
	
}