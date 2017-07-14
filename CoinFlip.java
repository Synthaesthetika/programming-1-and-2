import java.util.Scanner;

public class CoinFlip {
	
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	String coin,repeat;
	int foo,bar,baz;
	foo = 1;
	bar = 2;

	do {

		System.out.println("Heads or Tails? ");
		coin = input.next();

		if (coin.equals("Heads")) {
			heads(coin);
		} else if (coin.equalsIgnoreCase("Tails")) {
			tails(coin);
		}

		System.out.print("Do you want to continue? ");
		repeat = input.next();

	} while (repeat.equals("Y"));

	baz = justToSee(foo, bar);
	System.out.println(baz);

	}

	public static void heads(String val) {

		System.out.println("You chose " + val + ". You win!");

	}

	public static void tails(String val) {

		System.out.println("You chose " + val + ". You lose!");

	}

	public static int justToSee(int x, int y) {

		int z = 0;
		System.out.println(x + " " + y + " " + z);
		return(x+y+z);
	}
}
