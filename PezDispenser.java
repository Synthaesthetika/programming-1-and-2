import java.util.*;

public class PezDispenser {

        public static void main(String[] args){

		/*String[] candies = new String[10];
		candies[0] = "grape";
		candies[1] = "cherry";
		candies[2] = "lemon";
		candies[3] = "lime";
		candies[4] = "strawberry";
		candies[5] = "raspberry";
		candies[6] = "blueberry";
		candies[7] = "blackberry";
		candies[8] = "apple";
		candies[9] = "peach";*/

		Scanner input = new Scanner(System.in);
		
		System.out.println("Please provide me with ten candy flavors.");
		
		String[] candies = new String[10];
		candies[0] = input.next(); //grape;
		candies[1] = input.next(); //cherry;
		candies[2] = input.next(); //lemon;
		candies[3] = input.next(); //lime;
		candies[4] = input.next(); //strawberry;
		candies[5] = input.next(); //raspberry;
		candies[6] = input.next(); //blueberry;
		candies[7] = input.next(); //blackberry;
		candies[8] = input.next(); //apple;
		candies[9] = input.next(); //peach;

         //System.out.println(Arrays.toString(candies));        
         System.out.println("Here are your flavors.");
		System.out.println(Arrays.toString(candies));  
		
		for(int i=9;i>=0;i--) {
			System.out.println(candies[i]);
		}

       
}}
