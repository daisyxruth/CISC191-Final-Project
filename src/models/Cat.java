/**
* Lead Author(s):
* @author daisygarcia; student ID
* @author monix williams-garcia; student ID
*
* Other Contributors:
* alex chow; achow@sdccd.edu
*
* References:
* Morelli, R., & Walde, R. (2016).
* Java, Java, Java: Object-Oriented Problem Solving
* https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
*
*
* Version: 2026-04-30
*/
package models;

/**
 * Purpose: The reponsibility of Cat is to act as a parent
 * class to GoodCat and EvilCat
 *
 */
public abstract class Cat
{
	private String name; //a cat has-a name
	//a cat has a picture
	
	//a cat is good or evil
	public enum Morality
	{
		GOOD,
		EVIL
	}
	
	
	public Cat()
	{
		name = "Unnamed Cat";
	}
	
	public Cat(String newName)
	{
		name = newName;
	}
	
	
	public String getName()
	{
		return name; 
	}
	
	public abstract Morality getMorality();


	public void setName(String newName)
	{
		this.name = newName;
		
	}

	

}
