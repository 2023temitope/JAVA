package oop;

public class App {

	public static void main(String[] args) {
		Cat moggy = new Cat();
		moggy.name = "Tiddles";
		moggy.breed = "Persian";
		moggy.age = 12;
		moggy.colour = "Blonde";
//moggy.print();in place of the below if you use void describe in cat.Java
		System.out.println(moggy.name);
		System.out.println(moggy.breed);
		System.out.println(moggy.age);
		System.out.println(moggy.colour);

		Cat moggy2 = new Cat();
		moggy2.name = "Jess";
		moggy2.age = 60;
		moggy2.colour = "Black And White";
//moggy2.print();inplace of below
		System.out.println(moggy2.name);
		System.out.println(moggy2.age);
		System.out.println(moggy2.colour);
		moggy2.sleep();

		Cat[] cats = { moggy, moggy2 };
// for each cat of cats
		for (Cat cat : cats) {

		}
	}
}