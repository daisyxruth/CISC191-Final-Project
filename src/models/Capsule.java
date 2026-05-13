/**
* Lead Author(s):
* @author daisygarcia; student ID
* @author Full name; student ID
*
* Other Contributors:
*
* References:
* Morelli, R., & Walde, R. (2016).
* Java, Java, Java: Object-Oriented Problem Solving
* https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
*
*
* Version: 2026-05-05
*/
package models;


/**
 * Purpose: The reponsibility of Capsule is ...
 *
 * Capsule is-a ...
 * Capsule is ...
 */
public class Capsule
{
	
	private Cat capsuleCat;
	
	public Capsule()
	{
		capsuleCat = CatFactory.getRandomCat(); 
	}
	
	public Cat getCapsule()
	{
		return capsuleCat;
	}
	

}
