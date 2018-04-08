package javastart;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class BinarnyZO2 {

	public static void main(String[] args) {
		RandomAccessFile readStream = null;
		RandomAccessFile writeStream = null;
		

		try {
			readStream = new RandomAccessFile("daneBinarne.txt", "r");
			writeStream = new RandomAccessFile("przekopiowane.txt", "rw");
		} catch (FileNotFoundException e) {
			System.out.println("Opening stream error");
		}
		
		int byteRead = 0;
		int byteTotal = 0;
		byte[] buffer = new byte[1024];
		
		try {
			while ((byteRead = readStream.read(buffer)) != -1) {
				writeStream.write(buffer,0,byteRead);
				byteTotal += byteRead;
			}
		} catch (IOException e) {
			System.out.println("IO Error");
		}

		try {
			if (readStream != null) {
				readStream.close();
			}
			if (writeStream != null) {
				writeStream.close();
			}
		} catch (IOException e) {
			System.out.println("Closing stream error");
		}
		System.out.println("Bytes copied: "+byteTotal);
	}

}
