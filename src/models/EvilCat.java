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
* Version: 2026-05-06
*/
package models;

/**
 * Purpose: The reponsibility of EvilCat is ...
 *
 * EvilCat is-a ...
 * EvilCat is ...
 */
public class EvilCat extends Cat
{
	private String name;
	private String evilCatMessage;
	
	enum EvilTypes 
	{
		IRIS_CAT,
		ANGRY_CAT,
		HUNGRY_CAT,
	}
	
	public EvilCat()
	{
		super();
		evilCatMessage = "This evil cat says, \"You must solve this riddle to continue!\""; 
	}
	
	public EvilCat(String name)
	{
		this.name = name;
		evilCatMessage = "This evil cat says, \"You must solve this riddle to continue!\"";
	}

	public String getEvilCatMessage()
	{
		return evilCatMessage;
	}
	
	@Override
	public String toString()
	{
		return name + ": " + getEvilCatMessage();
	}

	@Override
	public Morality getMorality()
	{
		return Morality.EVIL;
	}
}
