package graficzne;

import java.awt.EventQueue;

public class TestApp2 {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable(){
			@Override
			public void run(){
				new KeyTest();
			}
		});

	}

}
