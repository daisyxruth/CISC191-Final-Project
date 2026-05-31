/**
* Lead Author(s):
* @author daisygarcia; student ID
* @author Full name; student ID
*
* Other Contributors:
* Full name; student ID or contact information if not in class
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

import java.util.LinkedList; 
import java.util.Queue;


/**
 * Purpose: The reponsibility of Gachapon is to hold the capsules/ 
 * fill the "machine" with the capsules that will be pulled by the player
 * 
 *
 */
public class Gachapon
{
	private Queue<Cat> capsulesToPull;

	public Gachapon()
	{
		capsulesToPull = new LinkedList<>();
	}
	
	public void fillGachapon()
	{
		
		for (int i = 0; i < 10; ++i)
		{
			capsulesToPull.add(CatFactory.getRandomCat()); 			
		}
	}

	public Cat drawCat()
	{
		Cat catToDraw = capsulesToPull.remove();
		
		return catToDraw;
	}

}
