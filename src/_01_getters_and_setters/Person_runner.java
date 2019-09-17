package _01_getters_and_setters;

public class Person_runner {
	public static void main(String[] args) {

		Person person1 = new Person();
		Person person2 = new Person();
		Person person3 = new Person();
		person1.setName("Asher");
		person2.setName("Daniel");
		person3.setName("Auggie");
		person1.setSuperpower("naruto running");
		person2.setSuperpower("power to close tabs with his mind");
		person3.setSuperpower("ability to create a nuclear bomb with his mouth");
System.out.println(person1.toString());
System.out.println(person2.toString());
System.out.println(person3.toString());
	}
}