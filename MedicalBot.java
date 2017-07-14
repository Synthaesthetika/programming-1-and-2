
/*{Program Name: MedicalBot.java, Objective: Using the if-else and looping.

/*Using the temperature sensor, place ones finger, or wrist on the thermo resistor. Determine if your temperature is *normal (approx 78 deg). The temperature is read in Celsius and you must convert it. Based on the reading, change the *Finches light color to reflect a person’s temperature. Keep in mind, the temperature sensor is accurate to within 2 *degrees Fahrenheit.

*/Go the Finch web site and look up in the API for Finch how record a temperature reading.Cons: Might be hard to test if everyone has normal temperature, consider using ice cube and something hot to test with
}*/

/*{ Will need to do some calculations loops to convert Celsius to Fahrenheit.
}/*

package Code.Users\Clear Thinking\Documents\Notepad++Portable\MedicalBot.java

import edu.cmu.ri.createlab.terk.robot.finch.Finch;
import java.util.*;

public class MedicalBot{

	public static void main(String[] args) {
	
		Finch Raver = new Finch();
		double celsius = Raver.getTemperature();
		double fahrenheit = celsius*1.8+32;
		
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
		
		Raver.quit();
		System.exit(0);
	
	
	 //double getTemperature();
	//public boolean isTemperature(double limit);
	
}