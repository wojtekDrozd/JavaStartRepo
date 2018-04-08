package graficzne;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Button2 extends JButton implements ActionListener {
	
	Button2() {
		super("I'm yellow");
		addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		setBackground(Color.YELLOW);
	}
}
