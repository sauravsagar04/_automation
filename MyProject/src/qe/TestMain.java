package qe;

class Animal {
	public void eat() {
		System.out.println("Animal eat....");
	}
	public void sv() {
		System.out.println("oahdd");
	}
}

class Dog extends Animal {
	public Dog() {
		
	}
	public void eat() {
		System.out.println("Dog eat....");
	}
	public void bark() {
		System.out.println("bark.....");
	}
}

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Animal obj = new Animal();
//		obj.eat();
//		obj = new Dog();
//		obj.eat();
//	 Animal d = new Dog();
//	d = (Animal)d;
//		d.eat();
		
//		Animal a = new Dog();
//		a.eat();
		
		Animal a = new Dog();
			


	}

}
