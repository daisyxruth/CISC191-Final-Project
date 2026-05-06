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
* Version: 2026-04-30
*/
package models;

import java.util.Random;

import models.EvilCat.Types;

/**
 * Purpose: The reponsibility of CatFactory is ...
 *
 * CatFactory is-a ...
 * CatFactory is ...
 */
public class CatFactory
{
	private static Random rngCatMorality = new Random();
	private static Random rngCatTypes = new Random();
	
	public static Cat getRandomCat()
	{
		switch(rngCatMorality.nextInt(2))
		{
			case 0: 
				GoodCat goodCat = new GoodCat();
				return goodCat;
				
			case 1:
				EvilCat evilCat = new EvilCat();
				return evilCat;
				
				default:
					return null;
		}
		
		
		
	}
	
	public static GoodCat fromGoodCatType(GoodCat.Types goodCatType) 
	{
		switch(goodCatType)
		{
			case SLEEPY_CAT:
				return new GoodCat("Sleepy Cat", 
						"Watch me sleep all worries away! In sleep I'll dream good luck your way.");
			case PRETTY_CAT:
				return new GoodCat("Pretty Cat", 
						"This charming cat wishes you good luck!"); 
			case SHY_CAT:
				return new GoodCat("Shy Cat", 
						"I've got your back... from over here..."); 				
				
				default:
					return null;
			
		}
	}
	
	public static EvilCat fromEvilCatType(EvilCat.Types evilCatType)
	{
		switch(evilCatType)
		{
			case IRIS_CAT:
				return new EvilCat("Iris", 
						"Watch me sleep all worries away! In sleep I'll dream good luck your way.");
			case ANGRY_CAT:
				return new EvilCat("Angry Cat", 
						"This charming cat wishes you good luck!"); 
			case HUNGRY_CAT:
				return new EvilCat("Hungry Cat", 
						"I've got your back... from over here..."); 				
				
				default:
					return null;
			
		}
	}
	
	public static EvilCat.Types determineEvilCatType(int selection)
	{
		switch(selection)
		{
			case 1:
				return Types.IRIS_CAT; 
				
			case 2:
				return Types.ANGRY_CAT;
				
			case 3: 
				return Types.HUNGRY_CAT;
				
				default: 
					return null;
		}
	}
}
