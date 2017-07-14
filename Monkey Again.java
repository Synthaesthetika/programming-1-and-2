


Monkey() {
	Scanner input = new Scanner(System.in);
	System.out.println("Your monkey needs a name, give me one: ");
	monkeyName  = input.next();
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
		System.out.println("Eek, Eek, I'm a monkey!");
	}
	
	