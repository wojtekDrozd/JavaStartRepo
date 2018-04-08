package graficzne;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Button3 extends JButton implements ActionListener {
	
	private JPanel buttonPanel;
	private boolean wcisniety = false;
	
	Button3() {
		super("Nie wci�ni�ty");
		addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (wcisniety)
			setText("Wci�ni�ty");
		else
			setText("Nie wci�ni�ty");
		wcisniety = !wcisniety;
	}
}
