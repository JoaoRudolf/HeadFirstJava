package sizeAffectsBark;

public class DogTestDrive {

	public static void main(String[] args) {
		
		Dog one = new Dog();
		one.size = 70;
		one.name = "Okami";
		
		Dog two = new Dog(8, "Kowalsky");
		
		Dog three = new Dog(35);
		three.name = "Baltasar";
		
		one.bark(5);
		two.bark(2);
		three.bark(4);
		
		Dog four = new Dog();
		System.out.println(four + " weights " + four.size + " kg.");
		four.bark(1);
		
		System.out.println(four.toString());
		
	}
}
