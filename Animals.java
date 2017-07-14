/*The Finch has visited a farm recently and would like to mimic the animals at the farm.  
Could you help the Finch do this?  
Make a class that has the following public and private methods:

Public:
String getAnimal()
boolean setAnimal(String animal)
void setRandomAnimal()
boolean playAnimal()

Private: 
void Cow()
void Horse()
void Duck()
void Chicken()
void Sheep()
 

A program should interact with the class through the public methods, by setting the desired animal to play and then using the playAnimal method to call the appropriate private animal method.  Private methods for the different animals should do their best to have the Finch imitate the animal through movement, sound, and light.  You may find this site useful in conjunction with the playWav method.

A couple of the public methods are boolean to add an extra layer of error reporting to the class.  setAnimal should return true if the String argument was one of the five animal types (Cow, Horse, Duck, Chicken, or Sheep), and false otherwise.  playAnimal is also boolean - it should return true if a valid animal has been set by a call to setAnimal or setRandomAnimal, and false otherwise.  
*/


package Code.finchPackage;

import java.util.*;
import edu.cmu.ri.createlab.terk.robot.finch.Finch;

class Animals
{
		Finch James = new Finch();
		Scanner input = new Scanner(System.in);
		Random guess = new Random();
		String chsdc;
		
		
		public String getAnimal(){
				return (chsdc);
		}			

		public boolean setAnimal(String animal){
		//setAnimal should return true if the String argument was one of the five animal types (Cow, Horse, Duck, Chicken, or Sheep), and false otherwise.	
			boolean right = true;
			boolean wrong = false;
			
			
		
			
			if (animal.equalsIgnoreCase("cow")){
				System.out.println(right);
				return (right);
				chsdc = "cow";			
			} else if (animal.equalsIgnoreCase("horse")){
			    chsdc = "horse";
				System.out.println(right);
				return (right);
			} else if (animal.equalsIgnoreCase("sheep")){
				chsdc = "sheep";
				System.out.println(right);
				return (right);	
			} else if (animal.equalsIgnoreCase("duck")){
				chsdc = "duck";
				System.out.println(right);
				return (right);
			} else if (animal.equalsIgnoreCase("chicken")){
				chsdc = "chicken";
				System.out.println(right);
				return (right);
			} else {
				System.out.println("You have not selected an Animal the Finch has seen on the Farm!");
				System.out.println(wrong);
				return (wrong);
				
			}	
		}	
		
				
		public void setRandomAnimal() {
		
			int selection = guess.nextInt(4);
			if (selection == 0) {
				chsdc = "cow";
				
			} else if (selection == 1) {
				chsdc = "horse";
				
			} else if (selection == 2) {
				chsdc = "sheep";	
			
			} else if (selection == 3) {
				chsdc = "duck";	
			
			} else if (selection == 4) {
				chsdc = "chicken";	
			
			}
		}


		
		
		public boolean playAnimal(String animal){
		//playAnimal is also boolean - it should return true if a valid animal has been set by a call to setAnimal or setRandomAnimal, and false otherwise.
			boolean right = true;
			boolean wrong = false;
			
		
			
			if (animal.equalsIgnoreCase("cow")){
				Cow();
				System.out.println(right);
				return (right);
				//animal = "cow";
				
			} else if (animal.equalsIgnoreCase("horse")){
				Horse();
				System.out.println(right);
				return (right);
			} else if (animal.equalsIgnoreCase("sheep")){
				Sheep();
				System.out.println(right);
				return (right);	
			} else if (animal.equalsIgnoreCase("duck")){
				Duck();
				System.out.println(right);
				return (right);
			} else if (animal.equalsIgnoreCase("chicken")){
				Chicken();
				System.out.println(right);
				return (right);
			} else {
				System.out.println("You have not selected an Animal the Finch has seen on the Farm!");
				System.out.println(wrong);
				return (wrong);
			
			}
		}	
		
	
		
		private void Cow(){
			James.saySomething("Mooooooo Mooooooo Mooooooo");
			James.setLED(0,255,0,1000); 
			James.setWheelVelocities(250, 25, 500);
			James.setWheelVelocities(5, 5, 500);
			James.setWheelVelocities(25, 25, 500);
			James.setWheelVelocities(0, 5, 500);
			//James.playClip("Code/finchPackage/WAV-File NAME");
			James.sleep(1000);
		}
		private void Horse(){
			James.playClip("Code/finchPackage/finchMusic/Horse.wav");
			James.setLED(0,0,255,1000); 
			James.setWheelVelocities(255, 255, 500);
			James.setWheelVelocities(-25, 255, 750);
			James.setWheelVelocities(255, 255, 500);
			James.sleep(1000);
		}
		private void Duck(){
			James.setLED(255,0,0,1000); 
			James.setWheelVelocities(25, 10, 150);
			James.setWheelVelocities(10, 25, 150);
			James.setWheelVelocities(25, 10, 150);
			James.setWheelVelocities(10, 25, 150);
			James.setWheelVelocities(25, 10, 150);
			James.setWheelVelocities(10, 25, 150);
			James.setWheelVelocities(25, 10, 150);
			//James.playClip("Code/finchPackage/WAVE-File NAME");
			James.saySomething("Quack, Quack, Quack");
			James.sleep(1000);
		}
		private void Chicken(){
			James.setLED(255,255,255,1000); 
			James.setWheelVelocities(15, 5, 500);
			James.setWheelVelocities(15, 5, 500);
			James.setWheelVelocities(25, 25, 500);
			James.setWheelVelocities(5, 15, 500);
			James.setWheelVelocities(5, 15, 500);
			James.setWheelVelocities(15, 5, 500);
			James.setWheelVelocities(15, 5, 500);
			James.setWheelVelocities(25, 25, 500);
			James.setWheelVelocities(5, 15, 500);
			James.setWheelVelocities(5, 15, 500);
			//James.playClip("Code/finchPackage/WAVE-File NAME"); 
			James.saySomething("Cluck, Cluck, Bock, Bock");
			James.sleep(1000);
		}
		private void Sheep(){
			James.setLED(50,255,100,1000); 
			James.setWheelVelocities(5, 5, 500);
			James.setWheelVelocities(1, 1, 500);
			James.setWheelVelocities(5, 5, 500);
			James.setWheelVelocities(1, 1, 500);
			//James.playClip("Code/finchPackage/WAVE-File NAME"); 
			James.saySomething("Bah, Bah, Bah, Bah");
			James.sleep(1000);
		}
		
		
		void endProgram(){
		James.quit();
		System.exit(0);
		}


}	
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		