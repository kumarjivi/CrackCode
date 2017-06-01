package stacksAndQueues;

import java.util.LinkedList;
import java.util.List;

import org.hamcrest.core.IsInstanceOf;

/***
 * An animal shelter holds only dogs and cats, and operates on a strictly "first in,
 * first out" basis. People must adopt either the "oldest" (based on arrival time) of
 * all animals at the shelter, or they can select whether they would prefer a dog or
 * a cat (and will receive the oldest animal of that type). They cannot select which
 * specific animal they would like. Create the data structures to maintain this system
 * and implement operations such as enqueue, dequeueAny, dequeueDog and
 * dequeueCat.You may use the built-in LinkedList data structure.
 * 
 * @author Kumar
 *
 */
public class AnimalShelter {
	List<Dog> dogList;
	List<Cat> catList;
	int order;
	
	AnimalShelter() {
		dogList = new LinkedList<Dog>();
		catList = new LinkedList<Cat>();
		order = 0;
	}
	public boolean enqueue(Animal any) {
		any.setOrder(order++);
		if(any instanceof Dog) {
			dogList.add((Dog)any);
		}
		if(any instanceof Cat) {
			catList.add((Cat)any);
		}
		return true;
	}
	
	public Animal dequeueAny() {
		if(dogList.isEmpty()) {
			if(!catList.isEmpty()) {
				return catList.get(0);
			} else {
				return null;
			}
		}
		if(catList.isEmpty()) {
			if(!dogList.isEmpty()) {
				return dogList.get(0);
			} else {
				return null;
			}
		}
		Dog tempDog = dogList.get(0);
		Cat tempCat = catList.get(0);
		if(tempDog.getOrder() < tempCat.getOrder()) {
			return dogList.remove(0);
		} else {
			return catList.remove(0);
		}
	}
	
	public Dog dequeueDog() {
		if(!dogList.isEmpty()) {
			return dogList.remove(0);
		} else return null;
	}
	
	public Cat dequeueCat() {
		if(!catList.isEmpty()) {
			return catList.remove(0);
		} else return null;
	}
}

class Animal {
	protected String name;
	private int order;
	
	public int getOrder() {
		return this.order;
	}
	
	protected void setOrder(int o) {
		this.order = o;
	}
	Animal () {};
	Animal (String name) {
		this.name = name;
	}
}

class Dog extends Animal {
	private String name;
	
	Dog(){};
	Dog(String n) {
		super(n);
	}
}

class Cat extends Animal{
	private String name;
	
	Cat(){};
	Cat(String n) {
		super(n);
	}
}