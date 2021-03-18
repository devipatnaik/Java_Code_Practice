package in.javadev.FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierFunctionalInterface {

	public static void main(String[] args) {

		Supplier<String> supplier = () -> "Hi Hello bwby";
		
		//System.out.println(supplier.get());
		
		List<String> list = Arrays.asList("a","b","l");
		
		String result = list.stream().findAny().orElseGet(supplier);
		
		System.out.println(result);
	}

}
