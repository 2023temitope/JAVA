package oop.ex;

public class App {

	public static void main(String[] args) {
		Person pastor = new Person();
		pastor.name = "Matthew";
		pastor.job = "Apostle";
		pastor.age = 50;
		pastor.book = "newtestament";
		System.out.println(pastor.name);
		System.out.println(pastor.job);
		System.out.println(pastor.age);
		System.out.println(pastor.book);

		Person pastor2 = new Person();
		pastor2.name = "Elisha";
		pastor2.job = "Prophet";
		pastor2.age = 40;
		pastor2.book = "oldtestament";
		System.out.println(pastor2.name);
		System.out.println(pastor2.job);
		System.out.println(pastor2.age);
		System.out.println(pastor2.book);

		Person pastor3 = new Person();
		pastor3.name = "Revelation";
		pastor3.job = "Endtime";
		pastor3.age = 60;
		pastor3.book = "newtestament";
		System.out.println(pastor3.name);
		System.out.println(pastor3.job);
		System.out.println(pastor3.age);
		System.out.println(pastor3.book);
		Person[] personArray = { pastor, pastor2, pastor3 };
		for (Person person : personArray) {
		}

	}
}