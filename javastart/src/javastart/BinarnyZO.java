package javastart;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class BinarnyZO {

	public static void main(String[] args) {
		RandomAccessFile stream = null;
		int byteCount = 0;

		try {
			stream = new RandomAccessFile("daneBinarne.txt", "rw");
		} catch (FileNotFoundException e) {
			System.out.println("Error on opening stream");
		}

		try {
			stream.writeUTF("Wojtek");
			stream.writeInt(2018);
			stream.writeDouble(50 / 4);

			stream = new RandomAccessFile("daneBinarne.txt", "r");
			while (stream.read() != -1)
				byteCount++;

		} catch (IOException e) {
			System.out.println("Input Output Error");
		}

		try {
			if (stream != null)
				stream.close();
		} catch (IOException e) {
			System.out.println("Error on closing stream");
		}
		System.out.println("Bytes read: " + byteCount);
	}
}
