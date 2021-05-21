package sizeAffectsBark;

public class Dog {

	int size; //= 24;
	String name = "pluto";
	
	@Override
	public String toString() {
		return name.toString();
	}

	
	public Dog() {
	}

	public Dog(int size) {
		super();
		this.size = size;
	}

	public Dog(String name) {
		super();
		this.name = name;
	}

	public Dog(int size, String name) {
		super();
		this.size = size;
		this.name = name;
	}

	void bark(int numOfBarks) {
		if (size > 60) {
			while (numOfBarks > 0) {
				System.out.println(this.name + " does Woof! Woof!");
				numOfBarks = numOfBarks - 1;
			}
		} else if (size > 14) {
			while (numOfBarks > 0) {
				System.out.println(this.name + " does Ruff! Ruff!");
				numOfBarks = numOfBarks - 1;
			}

		} else {
			while(numOfBarks > 0) {
				System.out.println(this.name + " does Yip! Yip!");
				numOfBarks = numOfBarks - 1;
			}
		}
	}

}
