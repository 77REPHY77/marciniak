package podstawy;

import java.util.Scanner;

public class zadani13 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);

	System.out.println("wpisz odleg³oœæ przeby¹ w ci¹gu minuty (w metrach)");
double droga = sc.nextDouble();
System.out.println("droga w km/h wynosi:");
System.out.println(droga *60/1000);	
	}	
}