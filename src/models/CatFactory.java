/**
* Lead Author(s):
* @author daisygarcia; 5550075466
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

import models.EvilCat.EvilTypes;
import models.GoodCat.GoodTypes;


/**
 * Purpose: The reponsibility of CatFactory is to provide 
 * the different Cat Types
 */
public class CatFactory
{
	private static Random rngCatMorality = new Random();
	private static Random rngCatTypes = new Random();
	
	public static Cat getRandomCat()
	{
		// 1. generate a cat type number
		int catTypeNumber = rngCatTypes.nextInt(3);
		
		// determine whether the cat will be good or evil
		switch(rngCatMorality.nextInt(2))
		{
			case 0:
				GoodTypes goodCatType = determineGoodCatType(catTypeNumber);
				return fromGoodCatType(goodCatType);
				
			case 1:
				// 2. get the actual cat type from the number
				EvilTypes evilCatType = determineEvilCatType(catTypeNumber);
				
				// 3. call from evil cat type with the type 
				return fromEvilCatType(evilCatType);
				
				default:
					return null;
		}
	}
	
	public static GoodCat fromGoodCatType(GoodCat.GoodTypes goodCatType) 
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
				return new GoodCat("Shy Cat", "I've got your back... from over here..."); 				
				
				default:
					return null;
		}
	}
	
	
	public static EvilCat fromEvilCatType(EvilCat.EvilTypes evilCatType)
	{
		switch(evilCatType)
		{
			case IRIS_CAT:
				return new EvilCat("Iris");
			case ANGRY_CAT:
				return new EvilCat("Angry Cat"); 
			case HUNGRY_CAT:
				return new EvilCat("Hungry Cat"); 				
				
				default:
					return null;
		}
	}
	
	public static GoodCat.GoodTypes determineGoodCatType(int selection)
	{
		switch(selection) 
		{
			case 0:
				return GoodCat.GoodTypes.SLEEPY_CAT;
				
			case 1: 
				return GoodCat.GoodTypes.PRETTY_CAT;
				
			case 2: 
				return GoodCat.GoodTypes.SHY_CAT;
				
			default:
				return null;
		}
	}
	
	public static EvilCat.EvilTypes determineEvilCatType(int selection)
	{
		switch(selection)
		{
			case 0:
				return EvilCat.EvilTypes.IRIS_CAT; 
				
			case 1:
				return EvilCat.EvilTypes.ANGRY_CAT;
				
			case 2: 
				return EvilCat.EvilTypes.HUNGRY_CAT;
				
				default: 
					return null;
		}
	}
}
