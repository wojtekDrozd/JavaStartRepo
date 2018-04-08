package graficzne;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Button1 extends JButton implements ActionListener {
	
	private JPanel buttonPanel;
	private Color[] colors = {Color.GREEN, Color.BLUE, Color.RED};
	
	Button1(JPanel buttonPanel) {
		super("Random color");
		this.buttonPanel = buttonPanel;
		addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int index = new Random().nextInt(colors.length);
		buttonPanel.setBackground(colors[index]);
	}
}
