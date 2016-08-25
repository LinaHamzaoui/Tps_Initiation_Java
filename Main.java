package tp1;

import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Point p = new Point(5, 6);
		
		Point u = new Point(p);
		System.out.println(u.getX() + " " + u.getY());
		
		Point p1 = new Point(1,2);
		
		Point p2 = p1;
		
		Point p3 = new Point(1,2);
		
		List<Point> list = new ArrayList<Point>();
		
		list.add(p1);
		
		System.out.println(p1 == p2); // affiche true
		System.out.println(p1 == p3); // affiche false
		
		
		
		System.out.println(list.indexOf(p2)); // affiche 0
		System.out.println(list.indexOf(p3)); // affiche -1
		
		
		
		
		String s1 = "toto";
		String s2 = s1;
		String s3 = new String(s1);
		System.out.println(s1 == s2); // true
		System.out.println(s1 == s3); // false
		
		System.out.println(s1.equals(s2)); // true
		System.out.println(s1.equals(s3)); // true
		
		String s = "hello";
		s.toUpperCase();
		System.out.println(s);
	}
}
