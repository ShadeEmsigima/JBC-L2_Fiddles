//Play with
//classes, constructors, functions, parameters, returntypes
//(non) static or final values, final static values
//has-a, is-a relationships
//scope


public class Main {
	public static void main(String[] args) {
	Owner o1 = new Owner("Sterre");
	Owner o2 = new Owner("Jelle");
	System.out.println(o1.name + " and " + o2.name + " are 'owners'.");
	
	
	o1.greyhound = new Greyhound("Grijsje");
	System.out.println(o1.name + " has a " + o1.greyhound.breed + " called " + o1.greyhound.name + ".");
	o1.saintBernard = new SaintBernard("Piet");
	System.out.println(o1.name + " has a " + o1.saintBernard.breed + " call " + o1.saintBernard.name + ".");
	

	
	}
}

abstract class Animal{
	String animalType;	
	String conservationStatus;
	
	abstract void Move();
}

class Dog extends Animal{
	String name;
	final static String animalType = "dog";
	static String conservationStatus = "domesticated";
	String breedA;
	
	Dog(String s) { //override a constructor
		name = s;
	}
	
	@Override
	void Move() {
		System.out.println("The dog moves.");
	}
	
}

class Greyhound extends Dog {
	final static String breed = "Greyhound";
	
	Greyhound(String s) {
		super(s);
		name = s;
	}
	@Override
	void Move() {
		System.out.println("The Greyhound dashes around like a swift storm!");		
	}
	
}

class SaintBernard extends Dog {

	final static String breed = "Saint Bernard";

	SaintBernard(String s) {
		super(s); //what does this do?
		name = s;
	}
	
	@Override
	void Move() {
		System.out.println("The heavy Saint Bernard drags its paws over the ground leaving a fresh trail of drool.");
	}
}


class Owner{
	String name;
	//Dog dog;
	Dog dogs[];
	Greyhound greyhound;
	SaintBernard saintBernard;
	
	Owner(String s){
		name = s;
	}
	
	void WalkPet(Dog d) {
		if (d != null) {
			System.out.println(name + " walks their " + d.breedA + ".");
		}
		
		else {System.out.println(name + " does not have a dog to walk with.");}
	}
	void NameDog(Dog d, String n) {
		d.name = n;
		System.out.println(name + " has named their " + d.breedA + " " + d.name);
	}
}





