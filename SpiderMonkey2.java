import java.util.Scanner;

public class SpiderMonkey2 implements Monkey2 {

	private String monkeyName,furColor;

	public void Monkey() {
		Scanner input = new Scanner(System.in);
		System.out.println("Your monkey needs a name, give me one: ");
		monkeyName = input.next();
	}

	public void Monkey(String name) {
		monkeyName=name;
	}

	public String getName() {
		return(monkeyName);
	}

	public void setFurColor(String color) {
		furColor=color;
	}

	public String getFurColor() {
		return(furColor);
	}

	public void eek() {
		System.out.println("Eek Eek, I'm a monkey!");
	}

	/*void climbTree(int height) {
		System.out.println("Look that monkey just climbed a " + height + " foot tall tree!");
		if (height>10) {
			warning();
		}
	}*/

	public void climbTree(int height, String type) {
		System.out.println("Look " + monkeyName + " just climbed a " + height + " foot " + type + " tree!");
	}

	public void warning() {
		System.out.println("Don't fall!");
	}


//___
	private String HeadColor;

	public void setHeadColor(String color) {
		HeadColor = color;
	}

	public String getHeadColor() {
		return(HeadColor);
	}

	public void climbTree(int height) {
                System.out.println("Look that monkey just climbed a " + height + " foot tall tree!");
                if (height>100) {
                        warning();
                }
        }


}

