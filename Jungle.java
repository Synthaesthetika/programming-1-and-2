class Jungle {

	public static void main(String[] args) {
		int height = 20;
		String name = "Jojo";
		String fur = "brown";
		String  treeType = "elm";

		Monkey monkey1 = new Monkey();
		Monkey monkey2 = new Monkey(name);
		Monkey monkey3 = new Monkey("Cheetah");

		monkey1.setFurColor(fur);
		System.out.println("Monkey 1's hair is " + monkey1.getFurColor());

		Monkey.eek();

		monkey2.climbTree(height);
		monkey2.climbTree(height, treeType);
		//monkey1.climbTree(height, treeType);
	}
}
