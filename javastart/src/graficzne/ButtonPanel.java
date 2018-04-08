package graficzne;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class ButtonPanel extends JPanel {

	public static final int HEIGHT = 100;
	public static final int WIDTH = 300;
	private JPanel buttonPanel;

	public ButtonPanel() {
		Button1 button1 = new Button1(this);
		Button2 button2 = new Button2();
		Button3 button3 = new Button3();

		buttonPanel = this;

		setLayout(new FlowLayout());
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		add(button1);
		add(button2);
		add(button3);

	}


}
