
/*Targeted Concept(s):  Classes 
 
The Finch has visited a farm recently and would like to mimic the animals at the farm.  Could you help the Finch do this?  Make a class that has the following public and private methods:

Public 
	String getAnimal()
	boolean setAnimal(String animal)
	void setRandomAnimal()
	boolean playAnimal()
 Private
	private void Cow();
	private void Horse();
	private void Duck();
	private void Chicken();
	privatevoid Sheep();

A program should interact with the class through the public methods, by setting the desired animal to play and then using the playAnimal method to call the appropriate private animal method.  
Private methods for the different animals should do their best to have the Finch imitate the animal through movement, sound, and light.  You may find this site useful in conjunction with the playWav method.

A couple of the public methods are boolean to add an extra layer of error reporting to the class.
  setAnimal should return true if the String argument was one of the five animal types (Cow, Horse, Duck, Chicken, or Sheep), and false otherwise.  playAnimal is also boolean - it should return true if a valid animal has been set by a call to setAnimal or setRandomAnimal, and false otherwise.  
*/


import edu.cmu.ri.createlab.terk.robot.finch.Finch;

import java.util.Scanner;


public class FarmFinch {

	public static void main(String[] args) { //might need to be changed for private class
	//may need to be protected.
	
		Scanner input = new Scanner(System.in);
		Animal Barn = new Animal();
	
		Finch Raver = new Finch();
		private String Cow, Horse, Duck, Chicken, Sheep;
		
 
			*/Private methods for the different animals should do their best to have the Finch imitate the animal through movement, sound, and light/*
			*/setAnimal should return true if the String argument was one of the five animal types/*
			/*String getAnimal()
			boolean setAnimal(String animal) or void setRandomAnimal()
			boolean playAnimal() //use loop (5 needed) if/ else if/ needed at top, methods on bottomw
			*/
	
	//void boolean setAnimal();
		//If I were to use an array, could that be private?	
	//Use Constructors: will need 3, 1 for each class
	
	
	//will need print statement asking for user input
	
	System.out.println("Welcome to the Farm! I heard that Raver was learning about farm animals, and a talented impressionist. In the barn, we have a cow, horse, duck, chicken, and sheep. What animal would you like to try to imitate?");
	String stable = input.next();
	
		if (stable.equalsIgnoreCase("duck")) {
			Barn.setAnimal(stable);
				System.out.println("You chose the " + Barn.getAnimal());
			Barn.playAnimal(stable);
			
		} else if (stable.equalsIgnoreCase("chicken")) {
			Barn.setAnimal(stable);
				System.out.println("You chose the " + Barn.getAnimal());
			Barn.playAnimal(stable);
			
		} else if (stable.equalsIgnoreCase("sheep")) {
			Barn.setAnimal(stable);
				System.out.println("You chose the " + Barn.getAnimal());
			Barn.playAnimal(stable);
			
		} else if (stable.equalsIgnoreCase("cow")) {
			Barn.setAnimal(stable);
				System.out.println("You chose the " + Barn.getAnimal());
			Barn.playAnimal(stable);
			
		} else if (stable.equalsIgnoreCase("horse")) {
			Barn.setAnimal(stable);
				System.out.println("You chose the " + Barn.getAnimal());
			Barn.playAnimal(stable);
			
		} else {
					//stable.equalsIgnoreCase//("You chose the " + Barn.getAnimal())
			Barn.setRandomAnimal();
			Barn.setAnimal(Barn.getAnimal());
				System.out.println("Let's see if we can find " + Barn.getAnimal());
			Barn.playAnimal(stable);
		}
	
		Barn.endProgram();
		
		exit();
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
 


























