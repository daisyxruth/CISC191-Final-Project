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
*
* Version: 2026-06-01
*/
package models;

import java.util.Stack;


/**
 * Purpose: The reponsibility of DrawHistory is to track
 * the draw history using a stack
 */
public class DrawHistory
{
	 private Stack<Cat[]> history; // each entry is an array of 3 drawn cats

	    public DrawHistory() 
	    {
	        history = new Stack<>();
	    }

	    public void push(Cat[] draw) 
	    {
	        history.push(draw);
	    }

	    public Cat[] peek() 
	    {
	        if (history.isEmpty()) return null;
	        return history.peek();
	    }

	    public Cat[] pop() 
	    {
	        if (history.isEmpty()) return null;
	        return history.pop();
	    }

	    public int size() 
	    {
	        return history.size();
	    }

	    public boolean isEmpty() 
	    {
	        return history.isEmpty();
	    }
}
