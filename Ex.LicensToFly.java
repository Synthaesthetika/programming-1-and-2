/*Targeted Concept(s): Conditionals, Methods; Supported Language(s): Java 
You have just earned a new job at the Finch Flying Test Center and your task is to create a program that will test the Finch’s ability to complete multiple tasks and earn its “license to fly”. 
The program should include the use of several methods that will test the Finch’s capability to accelerate in x, y, and z directions - if all are greater than or equal to 1, then the Finch passes the test (the user must help the Finch with this task!). Also, the program will evaluate the Finch’s ability to detect obstacles in front of him/her. 
Please also write code to appear before and in between tests to prompt the Finch of the instructions. 
Upon completing each task, the Finch’s beak should turn either red or green depending on the results of that section. A green beak indicates a successful completion while a red beak results from a failed attempt. Also, you should print the Finch’s results after both tasks are completed as to whether or not the Finch gains his flying license (Finch passes if both tests are passed and fails otherwise). 

Good luck! Attached is a sample solution and a decorated description page.
*/

/*
 * Allison Chaffo
 * February 24, 2011
 * Franklin Regional, Murrysville, PA 
 * Use of Finch with methods getAccelerations and isObstacle  
 */

import edu.cmu.ri.createlab.terk.robot.finch.Finch;

public class Project 
{
	public static void main(String[] args) 
	{
		Finch myFinch = new Finch();
		
		int pass = 0;
	
		System.out.print("Welcome to the Finch Flying Test Center. Issuance of a license to fly " +
			"will depend on the finch's completion of two tasks: ");
		System.out.print("the acceleration segment and the obstacle section. If the task is completed " +
			"successfully, the bird's beak will turn green; failed attempts will result in a red beak. ");
		System.out.println("In order to pass the Finch Flying Test, both tasks must produce a green beak.");
		System.out.println();
		System.out.print("The first part of the assessment will be an acceleration test. This will " +
			"examine the finch's ability to accelerate in the x, y, and z directions. ");
		System.out.println("If acceleration in all directions is greater than or equal to one, the " +
			"finch will pass and a green beak will appear. Ready, set, go!");
		
		double[] acc = new double [3];

		acc = myFinch.getAccelerations();		//gets accelerations in x,y,and z directions 
		
		System.out.println();	
		System.out.println("Acceleration x =  " + acc[0]);
		System.out.println("Acceleration y =  " + acc[1]);	
		System.out.println("Acceleration z =  " + acc[2]);
		System.out.println();
		
		if (acc[0] >= 1 && acc[1] >= 1 && acc[2] >= 1)	//checks to make sure all accelerations are >= 1 
		{
			myFinch.setLED(0, 255, 0); //sets beak color to green 
			System.out.println("The Finch passed the Acceleration Test!");
			pass++;		//Finch passes the test if accelerations are >= than 1 
		}
		else 
		{	
			myFinch.setLED(255, 0, 0); //sets beak color to red 
			System.out.println("The Finch did not reach the required acceleration " +
				"and failed the Acceleration Test.");
		}
		
		myFinch.sleep(5000);
		
		System.out.println();
		System.out.print("The second part of the assessment will be the obstacle test. This will " +
			"examine the bird's ability to choose a path free of obstacles. If an obstacle is detected " +
			"as the finch moves forward in its path, the finch fails the test and a red beak will appear. ");
		System.out.println("Ready, set, go!");
		
		myFinch.setWheelVelocities(255, 255, 2000);	//moves finch forward to detect obstacles 
		myFinch.setLED(0, 0, 0);
		
		boolean obstacle = myFinch.isObstacle();	//detects if object is in front of finch 
		System.out.println();
		System.out.println("Obstacle present (true or false): " + obstacle);
		System.out.println();
		
		if (obstacle == true)
		{
			myFinch.setLED(255, 0, 0);	//sets beak color to red 
			System.out.println("There is an obstacle in the way. The Finch failed the Obstacle Test");
		}
		else
		{
			myFinch.setLED(0, 255, 0); //sets beak color to green 
			System.out.println("There is no obstacle. The Finch passed the Obstacle Test!");
			pass++;
		}
		
		System.out.println();
		System.out.println("Number of tests passed: " + pass);	//prints number of tests passed 
		
		if (pass == 2)		//determines if finch passes license test
			System.out.println("Congratulations! The Finch has passed the flying test and is now " +
				"licensed to fly!");
		else if (pass == 1)
			System.out.println("Your finch is on its way toward getting its license, but just needs " + 
				"a little more practice. Keep trying!");
		else
			System.out.println("Sorry, your finch isn't quite ready to fly on its own. " +
				"Keep practicing and try again!");
		
		myFinch.sleep(1000);
		
		myFinch.quit();
		System.exit(0);	
		
	}	
}