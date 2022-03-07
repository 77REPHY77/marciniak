package podstawy;

import java.util.Scanner;

public class Zadanie13 {
	
	public static void main(String[] args) {
		
Scanner sc= new Scanner(System.in);

int liczba1, liczba2;

System.out.println("wpisz liczbê pierwsz¹");

liczba1= sc.nextInt();


System.out.println("wpisz liczbê drug¹");

liczba2 = sc.nextInt();

if (liczba1>liczba2) 
System.out.println(liczba1 +" "+liczba2);

else if(liczba1<liczba2) System.out.println(liczba1 +" " + liczba2);

else if (liczba1 ==liczba2)	System.out.println(liczba1);	

	}
}
