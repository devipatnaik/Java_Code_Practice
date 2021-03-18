package in.javadev.parallelstream;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamTest {

	public static void main(String[] args) throws IOException {
		
		// Create a File Object
		File fileName = new File("C:\\Users\\devpatna\\Desktop\\devi.txt");
		
		// using parallel() method of BaseStream interface
		// Create Stream of String type
		Stream<String> text = Files.lines(fileName.toPath());
		
		text.parallel().forEach(System.out::println);
		
		System.out.println("*********************");
		
		// using parallelStream of the Collection interface
		List<String> textList = Files.readAllLines(fileName.toPath());
		
		textList.parallelStream().forEach(System.out::println);
		
		text.close();

	}

}
