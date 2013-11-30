package creational.prototype;

public class Client {

	public static void main(String[] args) {

		Prototype person1 = new Person("Fred");
		System.out.println("person 1:" + person1);
		Prototype person2 = (Person) person1.doClone();
		System.out.println("person 2:" + person2);

		Prototype dog1 = new Dog("Wooof!");
		System.out.println("dog 1:" + dog1);
		Prototype dog2 = (Dog) dog1.doClone();
		System.out.println("dog 2:" + dog2);

	}

}
