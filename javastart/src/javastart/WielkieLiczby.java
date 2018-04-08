package javastart;
import static java.lang.Math.*;

import java.math.BigInteger;

public class WielkieLiczby {

	public static void main(String[] args) {
		int a = -524;
		int b = 632;
		
		System.out.println(-pow(a,b));
		System.out.println(-abs(a));
		System.out.println(sqrt(pow(a,b)));
		
		BigInteger c = new BigInteger("414141414849525252525241");
		BigInteger d = new BigInteger("11515515151901414101741");
		
		BigInteger suma = c.add(d);
		BigInteger roznica = c.subtract(d);
		BigInteger iloczyn = c.multiply(d);
		BigInteger power = c.pow(4);
		BigInteger absolute = c.abs();
		
		System.out.println(suma);
		System.out.println(roznica);
		System.out.println(iloczyn);
		System.out.println(power);
		System.out.println(absolute);

	}

}
