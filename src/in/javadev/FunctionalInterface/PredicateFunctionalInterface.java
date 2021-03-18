package in.javadev.FunctionalInterface;

import java.util.function.Predicate;

public class PredicateFunctionalInterface {

	public static void main(String[] args) {

		Predicate<Integer> predicate = t -> t % 2 == 0;

		System.out.println(predicate.test(20));
	}
}
