
class SpiderMonkey extends Monkey { //extension of monkey, example of inheritance

	private String HeadColor;
	
	void setHeadColor(String color) {
		HeadColor = color;
	}
	
	String getHeadColor() {
		return(HeadColor);
	}
	
	void climbTree(int height) {
		System.out.println("Look that monkey just climed a " + height + "foot tall tree!");
		if (height>100) {
			warning();
		}
	} //overwrote it rather than overloaded it, which is another example of inheritance.
	
	//Because there's no main method, this code has to run through Jungle
	//warning is private, it's in the monkey class, accessing inherited method,
	//modifiers: ex: public static void
	//could create package
	//Use protected. this was added to Monkey.java
	
	
	