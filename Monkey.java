import java.util.Scanner;

class Monkey {

	private String monkeyName, furColor;

	Monkey() {
	}

	Monkey(String name) {
		monkeyName = name;
	}

	void setFurColor(String color) {
		furColor = color;
	}

	String getFurColor() {
		return(furColor);
	}

	static void eek() {
		System.out.println("Eek Eek, I'm a monkey!");
	}

	void climbTree(int height) {
		System.out.println("Look that monkey just climbed a " + height + " foot tall tree!");
		if (height>10) {
			warning();
		}
	}

	void climbTree(int height, String type){
		System.out.println("Look " + monkeyName + " just climbed a " + height + " foot " + type + "tree!");
	}

	private void warning() {
		System.out.println("Don't fall!");
	}
}

	//This is the code if you were to take user input for the monkey's name.


	/*Monkey() {
		Scanner input = new Scanner(System.in);
		System.out.println("Your monkey needs a name, please give me one." );
		monkeyName = input.next();
	}*/

	/*Monkey(String name) {
		monkeyName = name;
	}*/

	/*String getName() {
		return(monkeyName);
	}*/


