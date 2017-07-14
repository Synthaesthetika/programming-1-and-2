import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

class FileTweaker {

	public static void main(String[] args) throws IOException {
	
		Scanner userInput = new Scanner(System.in);
		ArrayList<String> tweakee = new ArrayList<String>(0;
		
		System.out.print("Please enter the name of the input text file: ");
		String inFile = userInput.next();
		
		System.out.print("Please enter the name of the output text file: ");
		String outFile = userInput.next();
		
		System.out.print("Would you like to append to the file (Y/N): ");
		char append = userInput.next();
		System.out.println(:1" + append);
		
		try{
		
			FileLoader loadee = new FileLoader(inFile);
			tweakee = loadee.loadFile();
			
			//AltFileLoader altLoadee = new AltFileLoader(inFile);
			//tweakee = altLoadee.loadFile();
			
			tweakee.set(2, "qux");
			
		} catch (IOException ioe) {
		
			System.out.println(ioe.getMessage());
			
		}
		
		try{
		System.out.println("2" + append); 		
		
			if (append == 'Y') {
			System.out.println("3" + append);
			
				FileDumper dumpee = new FileDumper(outFile, true);
				dumpee.dumpFile(tweakee);
				System.out.println("It made it here!");
			} else {
			System.out.println("4" + append);
			FileDumper dumpee = new FileDumper(outFile);
				dumpee.dumpFile(tweakee);
			}
		}
}