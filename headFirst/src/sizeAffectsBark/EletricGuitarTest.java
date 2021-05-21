package sizeAffectsBark;

import java.util.Date;

public class EletricGuitarTest {
	
	public static void main(String[] args) {
		
		EletricGuitar slash = new EletricGuitar();
		
		slash.setBrand("Les Paul");
		System.out.println(slash.getBrand());
		slash.setNumOfPickups(5);
		System.out.println(slash.getBrand() + " " + slash.getNumOfPickups());
		slash.setNumOfPickups(1);
		System.out.println(slash.getBrand() + " " + slash.getNumOfPickups());
		
		Date d = new Date();
		System.out.println(d);
	}

}
