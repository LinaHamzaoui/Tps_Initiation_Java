package tp1;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Entrez un nombre: ");
		int value1 = scanner.nextInt();
		System.out.print("Entree un deuxieme nombre: ");
		int value2 = scanner.nextInt();

		System.out.println(printSomme(value1,value2));
		System.out.println(printDifference(value1,value2));
		System.out.println(printMultiplication(value1,value2));
		System.out.println(printDivision(value1,value2));
	}

	public static String printSomme(int val, int val2){
		StringBuilder s = new StringBuilder();
		s.append(val);
		s.append("+");
		s.append(val2);
		s.append(" = ");
		s.append(val+val2);
		return s.toString();
	}

	public static String printDifference(int val, int val2){
		StringBuilder s = new StringBuilder();
		s.append(val);
		s.append("-");
		s.append(val2);
		s.append(" = ");
		s.append(val-val2);
		return s.toString();
	}
	public static String printMultiplication(int val, int val2){
		StringBuilder s = new StringBuilder();
		s.append(val);
		s.append("*");
		s.append(val2);
		s.append(" = ");
		s.append(val*val2);
		return s.toString();
	}
	public static String printDivision(int val, int val2){
		if( val2 != 0){
			StringBuilder s = new StringBuilder();
			s.append(val);
			s.append("/");
			s.append(val2);
			s.append(" -> q=");
			int q=val/val2;
			s.append(q);
			s.append(" r=");
			s.append(val-val2*q);
			return s.toString();
		}
		return "uhmmm Division par z�ro impossible !";
	}
}
