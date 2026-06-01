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

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.RenderingHints;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 * Purpose: The reponsibility of GachaponView is ...
 *
 * GachaponView is-a ...
 * GachaponView is ...
 */
public class GachaponView extends JFrame
{
	
	private static final int   NUM_SLOTS   = 3;
    private static final Color BG          = new Color(235, 238, 255);
    private static final Color BORDER_BLUE = new Color(100, 120, 200);
    private static final Color SLOT_EMPTY  = new Color(200, 205, 230);
    
    // GUI arrays 
    private JPanel[] slotPanels      = new JPanel[NUM_SLOTS];
    private JLabel[] catNameLabels   = new JLabel[NUM_SLOTS];

    private JButton drawButton;
    private JLabel  statusLabel;
	
	/**
	 * GachaponView.java has-a/has-many serialVersionUID
	 */
	private static final long serialVersionUID = -4451436345941333262L;
	
	
	public GachaponView(Gachapon gachapon)
	{
//		this.model = model; 
		
//		setTitle("Lucky Cat Gacha");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        // base panel with blue border
        JPanel basePanel = new JPanel(new BorderLayout(10, 12));
        basePanel.setBackground(BG);
        basePanel.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(BORDER_BLUE, 3, true),
            BorderFactory.createEmptyBorder(14, 14, 14, 14)
        ));
        
        // top row: machine graphic + title/button 
        JPanel topRow = new JPanel(new BorderLayout(16, 0));
        topRow.setBackground(BG);
        topRow.add(buildMachinePanel(), BorderLayout.WEST);
        topRow.add(buildTitlePanel(),   BorderLayout.CENTER);
        basePanel.add(topRow, BorderLayout.NORTH);

        // bottom row: 3 cat slots
        JPanel slotsRow = new JPanel(new GridLayout(1, NUM_SLOTS, 14, 0));
        slotsRow.setBackground(BG);
        for (int i = 0; i < NUM_SLOTS; i++) {
            slotsRow.add(buildSlotWrapper(i));
        }
        basePanel.add(slotsRow, BorderLayout.CENTER);

        setContentPane(basePanel);
        pack();
        setMinimumSize(new Dimension(620, 400));
        setLocationRelativeTo(null);
        setVisible(true);
		
		
	}
	
    // Painted gacha machine panel. 
    private JPanel buildMachinePanel() 
    {
        JPanel p = new JPanel() 
        {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2 = (Graphics2D) g;
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                                    RenderingHints.VALUE_ANTIALIAS_ON);
                // Body
                g2.setColor(new Color(75, 95, 185));
                g2.fillRoundRect(18, 8, 104, 180, 14, 14);
                
                // Globe
                g2.setColor(new Color(190, 210, 245, 210));
                g2.fillRoundRect(28, 18, 84, 84, 10, 10);
                g2.setColor(new Color(100, 120, 200));
                g2.drawRoundRect(28, 18, 84, 84, 10, 10);
                
                // Balls
                Color[] bc = {Color.WHITE, new Color(255,90,90),
                              new Color(90,210,255), new Color(255,220,80)};
                int[][] bp = {{38,24},{66,28},{52,52},{80,40}};
                for (int b = 0; b < bc.length; b++) {
                    g2.setColor(bc[b]);
                    g2.fillOval(bp[b][0], bp[b][1], 24, 24);
                    g2.setColor(bc[b].darker());
                    g2.drawOval(bp[b][0], bp[b][1], 24, 24);
                }
                
                // Coin slot
                g2.setColor(new Color(55, 75, 155));
                g2.fillRoundRect(58, 112, 24, 9, 4, 4);
                
                // Tray
                g2.setColor(new Color(55, 75, 155));
                g2.fillRoundRect(28, 148, 84, 32, 8, 8);
                
                // Outline
                g2.setColor(new Color(45, 65, 145));
                g2.setStroke(new BasicStroke(2.2f));
                g2.drawRoundRect(18, 8, 104, 180, 14, 14);
            }
        };
        p.setBackground(BG);
        p.setPreferredSize(new Dimension(145, 210));
        return p;
    }

    // Title label + Draw button + status label. 
    private JPanel buildTitlePanel() 
    {
        JPanel title = new JPanel();
        title.setLayout(new BoxLayout(title, BoxLayout.Y_AXIS));
        title.setBackground(BG);

        JLabel instructions = new JLabel("Draw three cats to determine your luck!");
        instructions.setFont(new Font("Monospaced", Font.BOLD, 20));
        instructions.setForeground(new Color(55, 75, 160));
        instructions.setAlignmentX(Component.CENTER_ALIGNMENT);

        drawButton = new JButton("Draw");
        drawButton.setFont(new Font("Monospaced", Font.BOLD, 18));
        drawButton.setBackground(new Color(180, 190, 220));
        drawButton.setFocusPainted(false);
        drawButton.setAlignmentX(Component.CENTER_ALIGNMENT);
 //       drawButton.addActionListener(e -> onDraw());

        statusLabel = new JLabel(" ");
        statusLabel.setFont(new Font("Monospaced", Font.PLAIN, 11));
        statusLabel.setForeground(new Color(100, 100, 150));
        statusLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        title.add(Box.createVerticalGlue());
        title.add(instructions);
        title.add(Box.createVerticalStrut(12));
        title.add(drawButton);
        title.add(Box.createVerticalStrut(6));
        title.add(statusLabel);
        title.add(Box.createVerticalGlue());
        return title;
    }
    
    /** Wrapper: name label on top, coloured slot panel below. */
    private JPanel buildSlotWrapper(int i) {
        JPanel wrapper = new JPanel();
        wrapper.setLayout(new BoxLayout(wrapper, BoxLayout.Y_AXIS));
        wrapper.setBackground(BG);

        catNameLabels[i] = new JLabel(" ", SwingConstants.CENTER);
        catNameLabels[i].setFont(new Font("Monospaced", Font.BOLD, 12));
        catNameLabels[i].setAlignmentX(Component.CENTER_ALIGNMENT);

        slotPanels[i] = new JPanel(new BorderLayout(4, 4));
        slotPanels[i].setPreferredSize(new Dimension(140, 140));
        slotPanels[i].setBackground(SLOT_EMPTY);
        slotPanels[i].setBorder(BorderFactory.createLineBorder(BORDER_BLUE, 1));

        wrapper.add(catNameLabels[i]);
        wrapper.add(Box.createVerticalStrut(3));
        wrapper.add(slotPanels[i]);
        return wrapper;
    }
	
	public static void main(String[] args)
	{
		new GachaponView(new Gachapon());
		
	}
}
