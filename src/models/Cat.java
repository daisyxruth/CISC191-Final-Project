/**
* Lead Author(s):
* @author daisygarcia; student ID
* @author Full name; student ID
* <<Add additional lead authors here>>
*
* Other Contributors:
* Full name; student ID or contact information if not in class
* <<Add additional contributors (mentors, tutors, friends) here, with contact information>>
*
* References:
* Morelli, R., & Walde, R. (2016).
* Java, Java, Java: Object-Oriented Problem Solving
* https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
*
* <<Add more references here>>
*
* Version: 2026-04-30
*/
package models;

/**
 * Purpose: The reponsibility of Cat is ...
 *
 * Cat is-a ...
 * Cat is ...
 */
public abstract class Cat
{
	private String name; //a cat has-a name
	//a cat has a picture
	//a cat is good or evil
	
	
	public Cat()
	{
		name = "Unnamed Cat";
	}
	
	public Cat(String newName)
	{
		this();
		name = newName;
	}
	
	
	

}
