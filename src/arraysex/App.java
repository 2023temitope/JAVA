package arraysex;

public class App {

	public static void main(String[] args) {
		int num = 0;
		int[] nums = new int[10];
		System.out.println("9:" + nums[9]);
		nums[1] = 3;
		for (int j = 0; j < nums.length; j++) {
			System.out.println("J:" + j + "NUM:" + nums[j]);
			nums[0] = 2;
			nums[2] = 24;
			nums[3] = 6;
			nums[4] = 8;
			nums[5] = 10;
			nums[6] = 12;
			nums[7] = 14;
			nums[8] = 16;
			nums[9] = 18;
			System.out.println("J:" + j + "NUM:" + nums[j]);

		}
	}

	public static String fizzBuzz1(int num) {
		if (num % 3 == 0 && num % 5 == 0) {
			return "FizzBuzz";

		} else if (num % 3 == 0) {
			return "Fizz";
		} else if (num % 5 == 0) {
			return "Buzz";
		} else {
			return "" + num;
		}

	}

	public static String fizzBuzz(int num) {
		String output = "";
		if (num % 3 == 0)
			output += "Fizz";
		if (num % 5 == 0)
			output += "Buzz";

		if (num % 10 == 0)
			output += "Yowzer";
		return output;
	}

}
