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
* Version: 2026-05-05
*/
package models;

/**
 * Purpose: The reponsibility of GoodCat is ...
 *
 * GoodCat is-a ...
 * GoodCat is ...
 */
public class GoodCat extends Cat
{
	private String goodLuckMessage;
	
	enum GoodTypes 
	{
		SLEEPY_CAT,
		PRETTY_CAT,
		SHY_CAT,

	}
	
	public GoodCat()
	{
		super("Good Cat"); 
		goodLuckMessage = "depends on the cat";
	}
	
	public GoodCat(String name, String newMessage)
	{
		super(name);
		goodLuckMessage = newMessage;
	}
	
	
	public String getGoodLuckMessage()
	{
		return goodLuckMessage; 
	}

	@Override
	public String toString()
	{
		return getName() + ": " + getGoodLuckMessage();
	}

	@Override
	public Morality getMorality()
	{
		return Morality.GOOD;
	}
	
	
	
}
