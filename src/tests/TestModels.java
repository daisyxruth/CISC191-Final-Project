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
package tests;

import static org.junit.jupiter.api.Assertions.*; 


import org.junit.jupiter.api.Test;

//import models.Capsule;
import models.Cat;
import models.Cat.Morality;
import models.CatFactory;
import models.Gachapon;
import models.GoodCat;

/**
 * Purpose: The reponsibility of TestModels is 
 *
 * TestModels is-a ...
 * TestModels is ...
 */
class TestModels
{

	// 1. Anticipate any behaviors
	// 2. Write your code with certain use cases
	
	@Test
	void test()
	{
		GoodCat newCat = new GoodCat();
		assertEquals(newCat.getGoodLuckMessage(), "depends on the cat");
//		Cat testCat = CatFactory.getRandomCat();
//		System.out.println(testCat.toString());

		Gachapon model = new Gachapon();
		model.fillGachapon();
		Cat testerCat = model.drawCat(); 
		
		
//		Morality myVar = testerCat.getMorality(); 
//		
//		switch(myVar)
//		{
//			case GOOD:
//				//System.out.println(testerCat.)
//		}
		
		System.out.println(testerCat.toString());
		
		System.out.println(testerCat.getName());
				
		
	}

}
