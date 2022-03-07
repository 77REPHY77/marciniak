package podstawy;

import java.util.Random;

public class liczbylosowe {
public static void main(String[] args) {

		
		Random r = new Random();		
	
		int x = r.nextInt(6) + 0;
		System.out.println(x);
		
		
		int g = r.nextInt(6) + 0;
		System.out.println(g);
		if (g == x)  System.out.println("liczky s¹ równe");
		else if (g>x)System.out.println("liczby s¹ ró¿ne");
		else if (g<x)System.out.println("liczby s¹ ró¿ne");
}
}
