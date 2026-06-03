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
* Version: 2026-06-01
*/
package models;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

//import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Purpose: The reponsibility of RiddleFrame is ...
 *
 * RiddleFrame is-a ...
 * RiddleFrame is ...
 */
public class RiddleFrame extends JFrame implements ActionListener
{

	/**
	 * RiddleFrame.java has-a/has-many serialVersionUID
	 */
	private static final long serialVersionUID = -3059972330558487024L;
	JRadioButton radiobutton, radiobutton2, radiobutton3;
	JLabel label, title, question;
	JButton btn;
	
	RiddleFrame()
	{
		//GUI main view set up and title
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800,600);
		this.setTitle("Evil cat riddle!");
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		
		title = new JLabel( "EVIL CAT STRIKES! Answer this riddle:");
		title.setBounds(200,50,350,50);
		title.setFont(new Font("Monospaced", Font.BOLD, 15));
		title.setBackground(Color.blue);
		title.setOpaque(true);
		title.setForeground(Color.white);
		title.setBorder(new EmptyBorder(0,10,0,0));
		
		
		//questions and their multiple choice answers
		question = new JLabel( "<html><div style='text-align:center'>Poor people have it,"
						+ "rich people need it, if you eat it you die,<br> What is it?");
		question.setBounds(129,120,475,50);
		question.setFont(new Font("Monospaced", Font.BOLD, 12));
		question.setBackground(Color.blue);
		question.setOpaque(true);
		question.setForeground(Color.white);
		question.setBorder(new EmptyBorder(0,10,0,0));
		
		btn = new JButton("Confirm Answer");
		btn.setBounds(220,380,300,50);
		btn.setFocusable(false);
		btn.setFont(new Font("Monospaced", Font.BOLD, 15));
		btn.setBackground(Color.blue);
		btn.setOpaque(true);
		btn.setForeground(Color.black);
		btn.addActionListener(this);
		
		radiobutton = new JRadioButton("Nothing");
		radiobutton.setFont(new Font("Monospaced", Font.BOLD, 12));
		radiobutton.setFocusable(false);
		radiobutton.setBounds(300,200,300,50);
		
		radiobutton2 = new JRadioButton("Food");
		radiobutton2.setFont(new Font("Monospaced", Font.BOLD, 12));
		radiobutton2.setFocusable(false);
		radiobutton2.setBounds(300,250,300,50);
		
		radiobutton3 = new JRadioButton("Time");
		radiobutton3.setFont(new Font("Monospaced", Font.BOLD, 12));
		radiobutton3.setFocusable(false);
		radiobutton3.setBounds(300,300,300,50);
		
		
		//adds the buttons
		ButtonGroup bg = new ButtonGroup();
		bg.add(radiobutton);
		bg.add(radiobutton2);
		bg.add(radiobutton3);
		
		this.add(title);
		this.add(question);
		this.add(radiobutton);
		this.add(radiobutton2);
		this.add(radiobutton3);
		this.add(btn);
		
		this.setVisible(true);
	}
	
	//tells us the message that comes up for each answer
	@Override
	public void actionPerformed(ActionEvent evt)
	{
		if(radiobutton.isSelected())
		{
			JOptionPane.showMessageDialog(this, "Correct! How lucky...");
		}
		
		if(radiobutton2.isSelected())
		{
			JOptionPane.showMessageDialog(this, "Incorrect! Evil cat wins.");
		}
		
		if(radiobutton3.isSelected())
		{
			JOptionPane.showMessageDialog(this, "Incorrect! Evil cat wins.");
		}
	}


}
