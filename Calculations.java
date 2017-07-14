import java.util.Scanner;

public class Calculations {

	public static void main (String [] args) {
	
				/*boolean cool = true;
				System.out.print("" + cool);
				int num1 ;*/
				
				Scanner input = new Scanner(System.in);
				int num1;
				int num2;
				
				System.out.print("Please give me a number: ");
				num1 = input.nextInt();
				System.out.print("Please give me another number: ");
				num2 = input.nextInt();
				System.out.println("I will now take those two numbers and perform operations.");
				/*System.out.println(num1 + " + " + num2);
				System.out.println(num1 + " - " + num2);
				System.out.println(num1 + " / " + num2);
				System.out.println(num1 + " * " + num2);*/
				int num3 = num1 + num2;
				System.out.println(num1 + " + " + num2 + " = " + num3);
				int num4 = num1 - num2;
				System.out.println(num1 + " - " + num2 + " = " + num4);
				int num5 = num1 / num2;
				System.out.println(num1 + " / " + num2 + " = " + num5);
				int num6 = num1 * num2;
				System.out.println(num1 + " * " + num2 + " = " + num6);
				
		}
}
