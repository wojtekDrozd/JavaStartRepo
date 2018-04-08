package graficzne;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ObrazPanel extends JPanel {
	private BufferedImage netImage;
	private BufferedImage diskImage;

	public ObrazPanel() throws MalformedURLException {
		super();

		File imageFile = new File("punto.jpg");
		URL imageURL = new URL("https://otomotopl-imagestmp.akamaized.net/images_otomotopl/854795010_1_732x488_2005r-warszawa_rev003.jpg");
		try {
			diskImage = ImageIO.read(imageFile);
			netImage = ImageIO.read(imageURL);
		} catch (IOException e) {
			System.err.println("Blad odczytu obrazka");
			e.printStackTrace();
		}
		int width = netImage.getWidth()+diskImage.getWidth();
		int hight = Math.max(netImage.getHeight(), diskImage.getHeight());
		Dimension dimension = new Dimension(width, hight);
		setPreferredSize(dimension);
	}

	@Override
	public void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.drawImage(netImage,0,0,this);
		g2d.drawImage(diskImage, netImage.getWidth(), 0, this);
	}
}
