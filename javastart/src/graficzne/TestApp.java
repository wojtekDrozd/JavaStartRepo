package graficzne;

import java.awt.EventQueue;
import java.net.MalformedURLException;

public class TestApp {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable(){
			@Override
			public void run(){
				try {
					new ObrazFrame();
				} catch (MalformedURLException e) {
					System.err.println("Blad odczytu obrazka z URL");
					e.printStackTrace();
				}
			}
		});
	}

}
