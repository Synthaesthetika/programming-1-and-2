Assignments that teach Classes
Finch visits the Farm by: tom 
OU - Project 2 by: tom 
OU - Project 1 by: tom 
OU - Lab 4 by: tom 
OU - Lab 3 by: tom 
More Assignments 
As opposed to the topic of Objects covered previously in the corpus, the topic of Classes concerns assignments that focus on showing students how to create their own class. Most of the assignments in this section cover the basics of classes: state, constructors, and public/private methods. Advanced topics like inheritance, interfaces, and polymorphism are covered later.

Creating simple classes for the Finch is really about creating a set of coherently themed methods for Finch. As with methods, classes for the Finch typically focus on either evaluating data, creating output, or encapsulating behaviors.  For example, one could make a class dedicated to having the Finch drive along certain shapes, or one which has the Finch mimic other birds.  Similarly, we could create classes that interpret data in more sophisticated ways; perhaps a class that analyzes Finch sensor inputs over time and does statistics on those inputs.  

In addition to these Finch-centered classes, many assignments may simply use the Finch as an input or output device to add interactivity to a program.

http://www.finchrobot.com/Assignments/classes


Targeted Concept(s):  Classes 



 Supported Language(s):  Java 

 Python 

 Visual Basic 

The Finch has visited a farm recently and would like to mimic the animals at the farm.  Could you help the Finch do this?  Make a class that has the following public and private methods:

Public 
	String getAnimal()
	boolean setAnimal(String animal)
	void setRandomAnimal()
	boolean playAnimal()
 Private
	void Cow()
	void Horse()
	void Duck()
	void Chicken()
	void Sheep()
 
A program should interact with the class through the public methods, by setting the desired animal to play and then using the playAnimal method to call the appropriate private animal method.  Private methods for the different animals should do their best to have the Finch imitate the animal through movement, sound, and light.  You may find this site useful in conjunction with the playWav method.

A couple of the public methods are boolean to add an extra layer of error reporting to the class.  setAnimal should return true if the String argument was one of the five animal types (Cow, Horse, Duck, Chicken, or Sheep), and false otherwise.  playAnimal is also boolean - it should return true if a valid animal has been set by a call to setAnimal or setRandomAnimal, and false otherwise.  







