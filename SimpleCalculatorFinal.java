import java.util.*;

public class SimpleCalculatorKim {
 
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	String r;

		do {
	
			System.out.println("This is a simple calculator. Please provide me with two separate numbers and an operator *, +, %, /, - to use the calculator.");
	
			double n0 = input.nextDouble();
			double n1 = input.nextDouble();
			String w = input.next();
	
		
			if (w.equals("*")) { 
			System.out.println(na + " * " + nx + " = " + multiply(na, nx));
  
			} else if (w.equals("/")) {
			System.out.println(na + " / " + nx + " = " + divide(na, nx));

			} else if (w.equals("%")) {
			System.out.println(na + " % " + nx + " = " + modulus(na, nx));

			} else if (w.equals("-")) {
			System.out.println(na + " - " + nx + " = " + subtract(na, nx));

			} else if (w.equals("+")) {
			System.out.println(na + " + " + nx + " = " + addition(na, nx));
			}	
			
			System.out.println("Would you like to continue? If so, type yes.");
			r = input.next();
	
		} while (r.equals("yes")); 
	}
	
        public static double divide(double g0, double g1) {
                double div = g0/g1;
                return (div);
		}

		public static double subtract(double g2, double g3) {
                double sub = g2-g3;
                return (sub);
		}

		public static double multiply(double g4, double g5) {
                double mult = g4*g5;
                return (mult);
        }

		public static double addition(double g6, double g7) {
                double add = g6+g7;
                return (add);
		}		
		public static double modulus(double g8, double g9) {
                double mod = g8+g9;
                return (mod);
		}
}




















