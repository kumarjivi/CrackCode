package stacksAndQueues;

public class AnimalShelterTest {

	public static void main(String[] args) {
		Animal d1 = new Dog("d1");
		Animal d2 = new Dog("d2");
		Animal d3 = new Dog("d3");
		Animal d4 = new Dog("d4");
		Animal d5 = new Dog("d5");
		Animal d6 = new Dog("d6");
		Animal c1 = new Cat("c1");
		Animal c2 = new Cat("c2");
		Animal c3 = new Cat("c3");
		Animal c4 = new Cat("c4");
		Animal c5 = new Cat("c5");
		Animal c6 = new Cat("c6");
		AnimalShelter test = new AnimalShelter();
		test.enqueue(d1);
		test.enqueue(c1);
		test.enqueue(d2);
		test.enqueue(c2);
		test.enqueue(d3);
		test.enqueue(d4);
		test.enqueue(c3);
		test.enqueue(c4);
		test.enqueue(d5);
		test.enqueue(d6);
		test.enqueue(c5);
		test.enqueue(c6);
		Animal an = test.dequeueCat();
		System.out.println(an.name);
		an = test.dequeueAny();
		System.out.println(an.name);
		an = test.dequeueAny();
		System.out.println(an.name);
		an = test.dequeueDog();
		System.out.println(an.name);
	}

}
