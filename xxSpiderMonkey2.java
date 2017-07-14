
import java.util.Scanner;

class SpiderMonkey2 implements Monkey2 {

	//private String monkeyName,furColor;

	Monkey() {
		Scanner input = new Scanner(System.in);
		System.out.println("Your monkey needs a name, give me one: ");
		monkeyName = input.next();
	}

	Monkey(String name) {
		monkeyName=name;
	}

	String getName() {
		return(monkeyName);
	}

	void setFurColor(String color) {
		furColor=color;
	}

	String getFurColor() {
		return(furColor);
	}

	static void eek() {
		System.out.println("Eek Eek, I'm a monkey!");
	}

	/*void climbTree(int height) {
		System.out.println("Look that monkey just climbed a " + height + " foot tall tree!");
		if (height>10) {
			warning();
		}
	}*/

	void climbTree(int height, String type) {
		System.out.println("Look " + monkeyName + " just climbed a " + height + " foot " + type + " tree!");
	}

	protected void warning() {
		System.out.println("Don't fall!");
	}


//___
	private String HeadColor;

	void setHeadColor(String color) {
		HeadColor = color;
	}

	String getHeadColor() {
		return(HeadColor);
	}

	void climbTree(int height) {
                System.out.println("Look that monkey just climbed a " + height + " foot tall tree!");
                if (height>100) {
                        warning();
                }
        }


}
}