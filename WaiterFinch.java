
/*Objective: The purpose of this program is to learn how to do calculations as well as using the Finch commands.

Write a program that computes the tax and tip on the restaurant bill. The program should ask the user for their name, amount of bill, and color they want the beak. The tax is 6.75% of the bill. The tip should be 20% of the total after adding the tax. Display the amount of bill, tax, tip, and total amount. Have the Finch be the waiter by saying your name and the amount you owe. The Finch should be facing you and be some distance away. Have the Finch move toward you and play a clip, tell you the amount you owe, and return to its original position.
garcon.java,
garcon2.java, 3 diff patrons, store total, tax, tip in individual arrays for each patron.
Commands:
 Initiating the Scanner: Scanner keyboard = new Scanner(System.in);
 Variable: dataType variableName;
 Output to the screen: System.out.print("This will output on the screen.");
 Finch Pause: myFinch.sleep(1000); // in milliseconds (1000 = 1 second)
 Finch Beak Color: myFinch.setLED(red,green,blue); // 0 to 255
 Finch Speak: myFinch.saySomething("The Finch will say this.");
 Finch Moves: myFinch.setWheelVelocities(left,right,time)
 // -255 to 255 & time is in milliseconds
 Finch Play Sound Clip: myFinch.playClip("filepath_goes_here");
 Get Keyboard String Input: variableName = keyboard.nextLine();
 Get Keyboard Double Input: variableName = keyboard.nextDouble(
*/

import java.util.*;

public class WaiterFinch {

	public static void main(String[] args)  {
		
		Scanner keyboard =  new Scanner(System.in);
				
		{myFinch.setLED(red); //I might need to change "red" to a number corresponding to red.
		System.out.println("Welcome to Cafe Midori. Today we're training a special waiter to help us out.");
			//I think it's supposed to be most complicated first, so I'm going to get Raver to speak here.
		myFinch.sayGreeting("Hello, I'm Garsohn. May I ask your name?");
			//System.out.println("Hello, I'm Garcon. May I ask your name?");
		guestName = keyboard.nextLine();
		//myFinch.sayName(guestName);
		myFinch.setWheelVelocities(right,55);
		myFinch.sleep(1000);//This is one second.
		System.out.println("Nice to meet you. I'll be coming back to check on you and see if you're doing alright");
		System.out.println("Would you like your check?");  	//this could really turn into a loop, but for the sake of efficiency, I'm not doing that now.
		//yes/no
		//getBill = keyboard.nextLine();
		//myFinch.sayGetBill=(getBill);
		myFinch.setWheelVelocities(left,65); //this is where the finch is suppposed to be going forward.
		//the tax will require arithemtic. fun}		
\			