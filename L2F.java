/*You have just earned a new job at the Finch Flying Test Center and your task is to create a program that will test the Finch’s ability to complete multiple tasks and earn its “license to fly”. 
The program should include the use of several methods that will test the Finch’s capability to accelerate in x, y, and z directions - if all are greater than or equal to 1, then the Finch passes the test (the user must help the Finch with this task!). Also, the program will evaluate the Finch’s ability to detect obstacles in front of him/her. 
Please also write code to appear before and in between tests to prompt the Finch of the instructions. 
Upon completing each task, the Finch’s beak should turn either red or green depending on the results of that section. A green beak indicates a successful completion while a red beak results from a failed attempt. Also, you should print the Finch’s results after both tasks are completed as to whether or not the Finch gains his flying license (Finch passes if both tests are passed and fails otherwise). */

import edu.cmu.ri.createlab.terk.robot.finch.Finch;

public class L2F {

	public static void main(String[] args) {
	
		Finch Raver = new Finch();
		int p1=0;
		
		//Raver.isObstacle();
		
		System.out.println("Welcome, again, Raver. Today we'll be testing if your skills are adequate for giving you a license to fly. You'll have two tasks: first, acceleration, and then an obstacle test.");
		System.out.println("Like most finches, if Raver fails, the beak will be red. If Raver passes, the beak will be green. Let's get started. Good luck, Raver!");
		
		System.out.println("For the accelration test, you will have three variables to test. If the acceleration is at or over 1, then you should be able to pass. ");		
		
		double[] zed = new  double [3];
		zed = Raver.getAccelerations();
		
		System.out.println("Acceleration x =  " + zed[0]);
		System.out.println("Acceleration y =  " + zed[1]);	
		System.out.println("Acceleration z =  " + zed[2]);
		
	if (zed[0] >= 1 && zed[1] >= 1 && zed[2] >= 1) {
			Raver.setLED(0,255,0);
			System.out.println("Raver totally passed the acceleration sequence.");
			p1++;
	} else { 
			Raver.setLED(255,0,0);
			System.out.println("Too bad, Raver failed the acceleration sequence. Bummer.");
			p1++;
	}
	
		Raver.sleep(4000);
		
		System.out.println("Now we're on the second task: obstacles. If you sense an obstacle, you won't be able to fly. In this case Raver's beak will turn red. In the case that there are no obstacles detected, Raver's beak will turn green, and Raver will be able to fly!");
		
		Raver.setWheelVelocities(255,255,4000);
		Raver.setLED(0,0,0);
		
		boolean obs = Raver.isObstacle();
		System.out.println("Obstacle sensed (true/false): " + obs);
		
	if (obs == true)  { //since this is boolean, would it also make sense to say true = 0?
			Raver.setLED(255,0,0);
			System.out.println("Looks like there's an obstacle in the way. Raver can't fly around it.");
	} else {
			Raver.setLED(0,255,0);
			System.out.println("Raver can fly.");
	}
	
		System.out.println("Number of passed tests: " + p1);
	
	if (p1 == 2) {
			System.out.println("Raver passed all the tests, and is now licensed to fly! Congratulations!");
	} else if (p1 ==1) {
			System.out.println("Raver passed one test of the two. Keep working at it, and you'll get you're license soon.");
	} else {
			System.out.println("Raver failed both tests. Keep practicing. The more opportunity you give yourself, the more likely you'll get it right.");
	}
	
		Raver.sleep(2000);
	
		Raver.quit();
		System.exit(0);
	
	}
}
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		