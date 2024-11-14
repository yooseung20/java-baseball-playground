package study;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String value = scanner.nextLine();
		String[] inputs = value.split(" ");
		System.out.print(calculate(inputs));
	}


	public static int calculate(String[] inputs) {
		int answer = parseInt(inputs[0]);

		for(int i =1; i < inputs.length-1; i+=2) {
			if(isPlus((inputs[i]))) answer += parseInt(inputs[i+1]);
			if(isMinus((inputs[i]))) answer -= parseInt(inputs[i+1]);
			if(isMultiply((inputs[i]))) answer *= parseInt(inputs[i+1]);
			if(isDivide((inputs[i]))) answer /= parseInt(inputs[i+1]);
		}

		return answer;

	}

	private static int parseInt(String s) {
		return Integer.parseInt(s);
	}

	private static boolean isPlus(String s) {
		return s.equals("+");
	}

	private static boolean isMinus(String s) {
		return s.equals("-");
	}

	private static boolean isMultiply(String s) {
		return s.equals("*");
	}

	private static boolean isDivide(String s) {
		return s.equals("/");
	}
}
