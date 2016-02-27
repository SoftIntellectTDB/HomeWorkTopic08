import java.util.Scanner;

public class Main {
	private static Scanner in = new Scanner(System.in);

	public static void f1(String name) {
		System.out.println("Greetings, " + name + "!");
	}

	public static int f2(int a, int b, int c) {
		return a * b * c;
	}

	public static void f3(int number) {
		if (number % 2 == 0) {
			System.out.println("четно");
		} else {
			System.out.println("нечетно");
		}
	}

	public static int MaxNumber(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

	public static void main(String[] args) {
		/*
		 * Напишете метод, който при подадено име отпечатва в конзолата
		 * "Greetings, <name>!" (Напишете програма, която тества този метод.)
		 */
		f1("Ivan");

		/*
		 * Дефинирайте метод, който приема 3 параметъра - цели числа и ги
		 * умножава едно с друго. Извикайте функцията 10 пъти с различни
		 * произволни числа.
		 */
		for (int i = 0; i < 10; i++) {
			System.out.println(f2((int) (Math.random() * 10),
					(int) (Math.random() * 15), (int) (Math.random() * 20)));
		}

		/*
		 * Дефинирайте метод, който приема един параметър – число, и принтира на
		 * екрана "четно", ако числото е четно, и "нечетно ", ако числото е
		 * нечетно. Демонстрирайте действието на фукцията с няколко примера
		 */
		for (int i = 0; i < 10; i++) {
			f3((int) (Math.random() * 10));
		}

		/*
		 * Създайте метод MaxNumber() с два целочислени (int) параметъра, който
		 * връща по-голямото от двете числа. Напишете програма, която прочита
		 * три цели числа от конзолата и отпечатва най-голямото от тях,
		 * използвайки метода MaxNumber().
		 */
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int d = MaxNumber(a, b);
		System.out.println(MaxNumber(c, d));
	}
}
