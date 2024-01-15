package operators;

public class App {
	public static void main(String[] args) {
//	TODO Auto-generated method stub
		System.out.println(10.0 / 4);
		System.out.println(0.1 + 0.1 + 0.1);
		System.out.println(1 + 1 + 1);
		System.out.println((1 + 1 + 1) / 10.0);

		int i = 12;
		System.out.println(i++);
		System.out.println(++i);
//	Methods are all initialised before they're called so call them wherever
		System.out.println(add(12, 24));
//	can't use a variable before its declared
//		system.out.println(x);
//		int x=27;
		System.out.println(greateThan(12, 15));

		int product = add(12, 4) * add(27, 6);
		System.out.println(product);
	}

	public static int add(int a, int b) {
		// TODO Auto-generated method stub
		return a + b;

	}

	public static boolean greateThan(int a, int b) {
		// TODO Auto-generated method stub
		return a > b;
	}

}
