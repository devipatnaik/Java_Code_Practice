package in.javadev.Optional;

import java.util.Optional;

public class OptionalExample {
	
	public static void main(String[] args) {
		String s=null;
		Optional<String> empty = Optional.empty();
		//Optional<Integer> nonEmpty = Optional.of(s.length()); // NPE
		Optional<String> mayBeEmpty = Optional.ofNullable(s);  // not throw NPE
		System.out.println(mayBeEmpty);
	}

}
