package graficzne;

import java.awt.EventQueue;

public class TestButton {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable(){
			@Override
			public void run(){
				new ActionFrame();
			}
		});

	}

}
