/*Convert the Monkey/SpiderMonkey example code from class to illustrate an interface/implements relationship rather than a class/subclass extends relationship. Submit the code on the VPS so that Monkey is the interface that SpiderMonkey implements. I have attached the example code from class just in case you missed it in class.

Due Date: 2/27/14
//use implements
*/

//Kim Lundin
//2/27/14
//Purpose: to showcase interfaces and implementations.


//import java.util.Scanner;

interface Monkey2 {

	//private String monkeyName,furColor;

	void Monkey() ;

	void Monkey(String name) ;

	String getName() ;

	void setFurColor(String color);

	String getFurColor() ;

	static void eek() ;

	void climbTree(int height) ;

	void climbTree(int height, String type) ;

	protected void warning() ;

}
