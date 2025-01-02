package application;

import java.util.Locale;
import java.util.Scanner;

import services.PrintService;

public class Generics {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		PrintService<String> ps = new PrintService<>();
		
		System.out.print("How many values? ");
		Integer n = sc.nextInt();
		
		for ( int i =0; i<n; i++) {
			String value = sc.next();
			ps.addValue(value);
		}
		
		System.out.println();
		System.out.print("Values:");
		ps.print();
		System.out.println("]");
		String x = ps.first();
		System.out.println("First: " + x);
		
		sc.close();
	}

}
