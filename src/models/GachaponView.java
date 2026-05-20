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
* Version: 2026-05-18
*/
package models;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Purpose: The reponsibility of GachaponView is ...
 *
 * GachaponView is-a ...
 * GachaponView is ...
 */
public class GachaponView extends JFrame
{
	
	private JPanel gachaponPicture;
	private JPanel instructionsPanel;
	private JPanel capsuleDrawsPanel;
	private Gachapon model;
	private JLabel inGameInstructions;
	
	private JPanel catDraw1;
	private JPanel catDraw2;
	private JPanel catDraw3;
	
	/**
	 * GachaponView.java has-a/has-many serialVersionUID
	 */
	private static final long serialVersionUID = -4451436345941333262L;
	
	
	public GachaponView(Gachapon model)
	{
		this.model = model; 
		
		this.setLayout(new BorderLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		gachaponPicture = new JPanel();
		JLabel temporaryPicture = new JLabel("Gacha picture will go here.");
		gachaponPicture.add(temporaryPicture);
		this.add(gachaponPicture, BorderLayout.WEST);
		
		instructionsPanel = new JPanel();
		inGameInstructions = new JLabel("Draw three cats to determine your luck!");
		instructionsPanel.add(inGameInstructions);
		this.add(instructionsPanel, BorderLayout.EAST);
		
		capsuleDrawsPanel = new JPanel();
		catDraw1 = new JPanel();
		catDraw2 = new JPanel();
		catDraw3 = new JPanel();

		catDraw1.setBackground(Color.BLUE);
		catDraw2.setBackground(Color.BLUE);
		catDraw3.setBackground(Color.BLUE);
		
		capsuleDrawsPanel.add(catDraw1);
		capsuleDrawsPanel.add(catDraw2);
		capsuleDrawsPanel.add(catDraw3);
		
		this.add(capsuleDrawsPanel, BorderLayout.SOUTH);

		pack();
		
	}
	
	
	
	public static void main(String[] args)
	{
		new GachaponView(new Gachapon());
		
	}
}
