
import java.util.*;
	
class Monkey implements SpiderMonkey {

	//private String HeadColor; //Interface is a list of methods

	Interface Monkey {

	private String monkeyName,furColor;

	Monkey() {
	}

	Monkey(String name) ;		

	String getName() ;
	
	void setFurColor(String color) ;
	

	String getFurColor() ;

	static void eek() ;

	void climbTree(int height) ;

	void climbTree(int height, String type) ;
	
	protected void warning() ;

	void setHeadColor(String color) ;

	String getHeadColor() ;

	void climbTree(int height) ;


}